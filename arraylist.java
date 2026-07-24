import java.util.Enumeration;
import java.util.Vector;
public class arraylist {
    public static void main(String [] args){
        Vector<String> v = new Vector<>();
        v.add("ram");
        v.add("Rohan");
        v.add("Shyam");
        System.out.println(v);

        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }
}
