import java.util.Scanner;

public class St5ringMan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String st = in.nextLine();

        //Number of capital letters, small letters, number of special symbols, total number of alphabets

        int numberOfCapitalLetters=0,numberOfSmallLetters=0, numberOfSpecialCharacters=0;
        int numberOfNumbers=0;

        //Your &&name is 00()Ya333$$sh

        for(int x=0;x<st.length();x++) {
            char ch = st.charAt(x);
            if (ch >= 'A' && ch <= 'Z') {
                numberOfCapitalLetters++;
            } else if (ch >= 'a' && ch <= 'z') {
                numberOfSmallLetters++;
            } else if (ch >= '0' && ch <= '9') {
                numberOfNumbers++;
            } else {
                numberOfSpecialCharacters++;
            }
        }

        System.out.println(numberOfCapitalLetters+" "+numberOfSmallLetters+" "+numberOfSpecialCharacters+" "+numberOfNumbers+" "+
        (numberOfCapitalLetters+numberOfSmallLetters));
    }

}
