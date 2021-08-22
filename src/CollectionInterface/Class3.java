package CollectionInterface;

import java.util.HashSet;
import java.util.Set;

public class Class3 {

    public static void main (String[] args)
    {
        Set<String> hashset= new HashSet<>();

        hashset.add("I ");
        hashset.add("Am");
        hashset.add("sorting");
        hashset.add("hash");
        System.out.println(hashset);
        //check of an element
        String Check ="D";
        System.out.println("Contains " + Check + " "
                + hashset.contains(Check));

        hashset.remove("sorting");
        System.out.println(hashset);
        //Iterating through elements
        for (String hs:hashset)
        {
            System.out.println(hashset);
        }

    }
}
