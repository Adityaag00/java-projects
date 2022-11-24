
import java.util.Scanner;

 public class classHash {
     
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.println("Please Enter Your Name");

        Scanner input = new Scanner(System.in);

        String str,ktr;
        ktr=input.nextLine();

        int i;
        str=ktr.toUpperCase();
        char ch;

        System.out.println("______________________________________");
        
        for(i=0;i<str.length();i++) {
            ch=str.charAt(i);
            switch(ch) {
                case 'A' :
                        System.out.println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n\n");
                        break;
                case 'B' :
                        System.out.println("..######..\n..#....#..\n..#####...\n..#....#..\n..######..\n\n");
                        break;
                case 'C' :
                        System.out.println("..######..\n..#.......\n..#.......\n..#.......\n..######..\n\n");
                        break;
                case 'D' :
                        System.out.println("..#####...\n..#....#..\n..#....#..\n..#....#..\n..#####...\n\n");
                        break;
                case 'E' :
                        System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..######..\n\n");
                        break;
                case 'F' :
                        System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..#.......\n\n");
                        break;
                case 'G' :
                        System.out.println("..######..\n..#.......\n..#####...\n..#....#..\n..#####...\n\n");
                        break;
                case 'H':
                        System.out.println("..#....#..\n..#....#..\n..######..\n..#....#..\n..#....#..\n\n");
                        break;
                case  'I':
                        System.out.println("..######..\n....##....\n....##....\n....##....\n..######..\n\n");
                        break;
                case  'J':
                        System.out.println("..######..\n....##....\n....##....\n..#.##....\n..####....\n\n");
                        break;
                case 'K':
                        System.out.println("..#...#...\n..#..#....\n..##......\n..#..#....\n..#...#...\n\n");
                        break;
                case 'L' :
                        System.out.println("..#.......\n..#.......\n..#.......\n..#.......\n..######..\n\n");
                        break;
                case 'M':
                        System.out.println("..#....#..\n..##..##..\n..#.##.#..\n..#....#..\n..#....#..\n\n");
                        break;
                case 'N' :
                        System.out.println("..#....#..\n..##...#..\n..#.#..#..\n..#..#.#..\n..#...##..\n\n");
                        break;
                case 'O' :
                        System.out.println("..######..\n..#....#..\n..#....#..\n..#....#..\n..######..\n\n");
                        break;
                case 'P' :
                        System.out.println("..######..\n..#....#..\n..######..\n..#.......\n..#.......\n\n");
                        break;
                case 'Q' :
                        System.out.println("..######..\n..#....#..\n..#.#..#..\n..#..#.#..\n..######..\n\n");
                        break;
                case 'R' :
                        System.out.println("..######..\n..#....#..\n..#.##...\n..#...#...\n..#....#..\n\n");
                        break;
                case 'S' :
                        System.out.println("..######..\n..#.......\n..######..\n.......#..\n..######..\n\n");
                        break;
                case 'T' :
                        System.out.println("..######..\n....##....\n....##....\n....##....\n....##....\n\n");
                        break;
                case 'U' :
                        System.out.println("..#....#..\n..#....#..\n..#....#..\n..#....#..\n..######..\n\n");
                        break;
                case 'V' :
                        System.out.println("..#....#..\n..#....#..\n..#....#..\n...#..#...\n....##....\n\n");
                        break;
                case 'W' :
                        System.out.println("..#....#..\n..#....#..\n..#.##.#..\n..##..##..\n..#....#..\n\n");
                        break;
                case 'X' :
                        System.out.println("..#....#..\n...#..#...\n....##....\n...#..#...\n..#....#..\n\n");
                        break;
                case 'Y' :
                            System.out.println("..#....#..\n...#..#...\n....##....\n....##....\n....##....\n\n");
                            break;
                case 'Z' :
                            System.out.println("..######..\n......#...\n.....#....\n....#.....\n..######..\n\n");
                            break;
                case ' ' :
                            System.out.println("..........\n..........\n..........\n..........\n\n");
                            break;
                case '.' :
                            System.out.println("----..----\n\n");
                            break;

            }
        }
        System.out.println("______________________________________");
   }
}
 

