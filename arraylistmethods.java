import java.util.ArrayList;

public class arraylistmethods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("ram");
        al.add("Rohan");
        al.add("Shyam");

        System.out.println(al);
    }

    public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<String> al2 = new ArrayList<>();

            al2.add("ram");
            al2.add("Rohan");
            al2.add("Shyam");

            System.out.println(al2);
            System.out.println("Size of ArrayList: " + al2.size());
            System.out.println("Is ArrayList empty? " + al2.isEmpty());
            System.out.println("Does ArrayList contain 'Rohan'? " + al2.contains("Rohan"));
        }
    }
}