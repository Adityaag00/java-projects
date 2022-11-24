import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;

public class Java8Tester {

    public static void main(String args[]) {
        System.out.println("Using Java 7: ");

        // Count empty strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("List: " +strings);
        long count = getCountEmptyStringUsingJava7(strings);

        System.out.println("Empty Strings: " + count);
        count = getCountLength3UsingJava7(strings);

        System.out.println("Strings of length 3: " + count);

        //Eliminate empty string
        List<String> filtered = deleteEmptyStringsUsingJava7(strings);
        System.out.println("Filtered List: " + filtered);

        //Eliminate empty string and join using comma.
        String mergedString = getMergedStringUsingJava7(strings,", ");
        System.out.println("Merged String: " + mergedString);
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //get list of square of distinct numbers
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("Squares List: " + squaresList);
        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

        System.out.println("List: " +integers);
        System.out.println("Highest number in List : " + getMax(integers));
        System.out.println("Lowest number in List : " + getMin(integers));
        System.out.println("Sum of all numbers : " + getSum(integers));
        System.out.println("Average of all numbers : " + getAverage(integers));
        System.out.println("Random Numbers: ");

        //print ten random numbers
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }

        System.out.println("Using Java 8: ");
        System.out.println("List: " +strings);

        count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);

        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

        filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
        System.out.println("List: " +integers);

        IntSummaryStatistics stats = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        System.out.println("Random Numbers: ");

        random.ints().limit(10).sorted().forEach(System.out::println);

        //parallel processing
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);
    }

    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        return (int)strings.stream().filter(s-> s.isEmpty()).count();
    }

    private static int getCountLength3UsingJava7(List<String> strings) {
        return (int)strings.stream().filter(s-> s.length()==3).count();
    }

    private static List<String> deleteEmptyStringsUsingJava7(List<String> strings) {
        return strings.stream().filter(s-> !s.isEmpty()).collect(Collectors.toList());
    }

    private static String getMergedStringUsingJava7(List<String> strings, String separator) {
        return strings.stream().reduce("",(a,b)->a+separator+b);
    }

    private static List<Integer> getSquares(List<Integer> numbers) {
       return numbers.stream().map(n->n*n).collect(Collectors.toList());
    }

    private static int getMax(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE,(integer, integer2) -> integer>integer2?integer:integer2);
    }

    private static int getMin(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE,(integer, integer2) -> integer<integer2?integer:integer2);
    }

    private static int getSum(List numbers) {
        return numbers.stream().mapToInt(x-> Integer.parseInt(""+ x)).reduce(0,(integer, integer2) -> integer+integer2);
    }

    private static int getAverage(List<Integer> numbers) {
        int sum=numbers.stream().reduce(0,Integer::sum);
        return sum/ numbers.size();
    }
}