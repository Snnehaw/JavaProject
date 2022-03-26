package CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortAsc {

    public static void main(String[] args)
    {
        ArrayList<String> Arr1 =new ArrayList<>();
        Arr1.add("A");
        Arr1.add("Z");
        Arr1.add("I");
        Arr1.add("Y");
        Arr1.add("P");

        System.out.println("Before SortAcc"+Arr1);
        Collections.sort(Arr1);
        System.out.println("After SortAcc"+Arr1);




    }
}
