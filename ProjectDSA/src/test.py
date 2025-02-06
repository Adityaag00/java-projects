#open tmp.txt
f = open('tmp.txt', 'r')

#iterate over the lines
all_parts_found = False
text_out = ''
is_part_found = False
text_next_to_part = ''
is_next_to_part_found = False
is_part_print_done = False

is_point_section_found = False
is_nested_point_section_found = False
is_nested_point_section_with_brackets_found = False
is_point_section_print_done = False

point_section_main = ''
point_section_nested = ''
point_section_nested_brackets = ''

is_section_end_found = False
text_added_in_output = ''

for line in f:
    line = line.strip()
    if not line:
        continue
    if 'Page' in line:
        if text_added_in_output and '3.15b(iii)' in text_added_in_output:
            text_out += 'END'
            text_out += '\n'
            break
        continue
    if not all_parts_found and 'PART' in line:
        is_part_found = True
        is_next_to_part_found = False
        is_part_print_done = False
        continue
    if is_part_found:
        if not line.isdigit() or int(line) not in [3, 4, 10]:
            print('Invalid part number: ' + line)
            is_part_found = False
            is_next_to_part_found = False
            continue
        text_next_to_part = line
        is_part_found = False
        is_next_to_part_found = True
        if line == '10':
            all_parts_found = True
        continue
    if is_next_to_part_found:
        if 'PART' in line:
            is_next_to_part_found = False
            continue
        if not is_part_print_done:
            text_out += '=====PART '+ text_next_to_part + '====='
            text_out += '\n'
            is_part_print_done = True
        text_out += line
        text_out += '\n'
        continue
    if '.' in line:
        parts = line.split('.')
        if not parts[0].isdigit():
            continue
        if is_point_section_found:
            if point_section_main not in line:
                is_point_section_found = True
                is_nested_point_section_found = False
                is_nested_point_section_with_brackets_found = False
                is_point_section_print_done = False
                point_section_main = line
                continue
            if not is_point_section_print_done:
                text_out += '=====Section '+ point_section_main + '====='
                text_out += '\n'
                is_point_section_print_done = True
            if '(' in line:
                split = line.split(" ")
                if len(split) > 1:
                    text_out += '=====Section '+ split[0] + '====='
                    text_added_in_output = split[0]
                    text_out += '\n'
                    does_more_exist = len(split) > 1
                    for i in range(1, len(split)):
                        if not split[i]:
                            continue
                        text_out += split[i]
                        text_out += ' '
                    if does_more_exist:
                        text_out += '\n'
                    continue
                text_out += '=====Section '+ line + '====='
                text_added_in_output = line
                text_out += '\n'
                continue
            is_nested_point_section_found = True
            point_section_nested = line
            continue
        is_point_section_found = True
        point_section_main = line
        continue
    if is_point_section_found:
        if is_nested_point_section_found:
            if line[0] == '(':
                point_section_nested+= line
                print('point_section_nested: ' + point_section_nested)
                text_out += '=====Section '+ point_section_nested + '====='
                text_added_in_output = point_section_nested
                text_out += '\n'
                continue
            is_nested_point_section_found = False
        if not is_point_section_print_done:
            text_out += '=====Section '+ point_section_main + '====='
            text_added_in_output = point_section_main
            text_out += '\n'
            is_point_section_print_done = True
        text_out += line
        text_out += '\n'

#save the output in a file
with open('output.txt', 'w') as f:
    f.write(text_out)

sections_to_extract = ['PART 3', 'PART 4', 'PART 10', '2.1(a)', '2.1(b)','2.1(c)','2.1(d)','3.13(a)', '3.14', '3.9(m)', '3.11(a)', '3.11(b)'
    , '3.10(a)', '3.10(b)','1.1(l)','2.1','3.13(a)']

text_out2 = ''
is_section_found = False

for line in text_out.splitlines():
    if line[0] == '=' and any(section in line for section in sections_to_extract):
        text_out2 += line
        text_out2 += '\n'
        is_section_found = True
        continue
    if is_section_found:
        if '=====' in line:
            is_section_found = False
            continue
        text_out2 += line
        text_out2 += '\n'

with open('output2.txt', 'w') as f:
    f.write(text_out2)