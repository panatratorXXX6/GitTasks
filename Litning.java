package pack5;

import java.util.Scanner;

public class Litning {
    public static void main(String[] args) {
        int a;
        float b = 1100;
        float c;

        System.out.println("Enter flashing time here");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        c = b * a;
        System.out.println(c);

    }
}
