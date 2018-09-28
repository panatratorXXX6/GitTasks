package pack7;

public class Calculate {
    public static void main(String[] args) {

        int primeNum;
        boolean prime = false;

        for (primeNum = 2; primeNum <= 100; primeNum++) {

            for (int i = 2; i < primeNum; i++) {
                if (primeNum % i != 0) {
                    prime = true;
                } else {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(primeNum);
            }
        }
    }
}
