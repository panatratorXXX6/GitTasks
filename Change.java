package packg;

public class Change {
    public static void main(String[] args) {
        String b = "Що за бяка ?";
        String  bbb;
        bbb = b.replaceAll("бяка", "вирізано цензурою");
        System.out.println(bbb);
    }
}
