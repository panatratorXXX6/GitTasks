package pack6;

import java.util.Random;
import java.util.Scanner;

public class GuessLetter {
    public static void main(String[] args) {

        char c = (char) ('A' + new Random().nextInt(26));

        Scanner scan = new Scanner(System.in);
        System.out.println(c);
        System.out.println("Please, guess the letter here");

        for (char i = 0; i < 26; i++) {
            char s = scan.next().charAt(0);

            if (c == s) {
                System.out.println("Hey bro, looks like you are the winner, let me check ... Yes!");
                break;
            } else {
                System.out.println("Hey bro, looks like you are the winner, let me check ... No!");

                if (Character.getNumericValue(c) > Character.getNumericValue(s)) {
                    System.out.println("I can give you one chance, but you know you are too low!");
                } else if (Character.getNumericValue(c) < Character.getNumericValue(s)) {
                    System.out.println("I can give you one chance, but you know you are too high");
                }
            }
        }
    }
}
