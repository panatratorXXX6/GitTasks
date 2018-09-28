package pack9;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.println("Put in your sentence to reverse");
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(st);

        System.out.println(stringBuilder.reverse().toString());
    }
}
