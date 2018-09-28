package pack10;

public class Marafon {
    public static void main(String[] args) {

        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

        int[] times = {341, 273, 278, 329, 445, 402, 388, 275,
                243, 334, 412, 393, 299, 343, 317, 265};

        int min = times[0];

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i] + " = " + times[i]);

            if(times[i] < min){
                min = times[i];
            }
        }
        System.out.println("\nThe time of winner is: " + min);
    }
}
