package bb;

import java.util.Scanner;

public class Gravi {
    public static void main(String[] args) {
        System.out.println("Enter your weight, please \n");
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextInt();
        System.out.println("Your weight is " + (weight * 0.17 + weight));


    }
}
