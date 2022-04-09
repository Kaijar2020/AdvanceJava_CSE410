
import java.util.*;

public class ArrayListToArray {

    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Contents of al: " + al);
        Object ia[] = al.toArray();
        int sum = 0;
        for (int i=0; i<ia.length; i++) {
            sum += ((Integer)ia[i]).intValue();
        }
        System.out.println("Sum is: " + sum);
    }
}
