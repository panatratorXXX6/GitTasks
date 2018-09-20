package cc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a[];
        double x = 0.1;
        System.out.println("Enter array size");

            Scanner scan = new Scanner(System.in);
            int readInt =scan.nextInt();

                if (readInt >= 0 & readInt < 5) {
                    System.out.println("Your number is " + readInt);
                } else {
                    System.out.println("Your number is invalid");
                }

            double b = readInt + readInt * x;
            System.out.println("The element you choose are increased on 10%: \n" + b);
        }
    }

