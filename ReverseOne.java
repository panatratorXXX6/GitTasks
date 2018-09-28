package pack911;

import java.util.Scanner;

public class ReverseOne {
    public static void main(String[] args) {

        System.out.println("Reverse here");
        Scanner scanner = new Scanner(System.in);
        String readRead = scanner.nextLine();
        StringBuilder sb = new StringBuilder(readRead);
        System.out.println(revMethod(sb));


    }
    public static String revMethod(StringBuilder sb){
        return sb.reverse().toString();
    }
}
