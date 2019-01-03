import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class App {
   static ArrayList<Integer> arr = new ArrayList<Integer>();

   public static void main(String[] args) {
        add();
    }

    public static void add() {

        Collections.addAll(arr, 1,2,3,4,5);
        System.out.println(arr.toString());
        arr.add(6);
        System.out.println(arr.toString());

        Iterator<Integer> it = arr.iterator();
        it.next();
        it.remove();

       System.out.println(arr.toString());
    }
    
}
