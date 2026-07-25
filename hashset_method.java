import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class hashset_method{


    public static void main(String [] args){

           ArrayList as = new ArrayList();
                as.add(78);
                  as.add(7);
                System.out.println(as);





        HashSet hs = new HashSet(as);
        hs.add(20);
        hs.add(40);
        hs.add(70);

        hs.add("Ram");
        hs.add("Shyam");
    System.out.println(hs);

        // //By iterator
        //   Iterator itr = hs.iterator();
        //   while(itr.hasNext()){
        //   System.out.println(itr.next());
        //   }



        System.out.println(hs.contains(20));
        System.out.println(hs.isEmpty());
        hs.remove("Ram");
        System.out.println(hs);
        System.out.println(hs.size());
        }
}

