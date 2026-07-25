import java.util.ArrayList;

public class methods {
    public static void main(String[] args) {
        System.out.println("This is a methods class.");
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(50);
        al.add(30);
        al.add(30);
        al.add("Raman");
        al.remove("Raman");
        al.add(2 , 60) ;
        al.remove(2);

        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.indexOf(30));
        System.out.println(al.lastIndexOf(30));
        al.set(2,33);
        System.out.println(al);


    }
}


