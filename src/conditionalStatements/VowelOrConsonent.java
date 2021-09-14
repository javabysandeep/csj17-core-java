package conditionalStatements;

import java.util.Scanner;

public class VowelOrConsonent {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.next();
        char[] arrayChars = input.toCharArray();

        for (int i = 0; i < arrayChars.length; i++) {
            if ((arrayChars[i] == 'A') || (arrayChars[i] == 'a') ||
                    (arrayChars[i] == 'E') || (arrayChars[i] == 'e')
            ) {
                System.out.println("Vowel");
            } else{
                System.out.println("consonent");
            }
        }


    }
}
