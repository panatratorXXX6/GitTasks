package aa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write your char type here: \n");

        while (true) {
            String readline = scanner.nextLine();
            System.out.println(readline);
            if (readline.equals("."))
                break;
        }
    }
}
