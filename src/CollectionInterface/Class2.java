package CollectionInterface;

import java.util.LinkedList;

public class Class2 {

    public static void main(String[] args)
    {
        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.add("I");
        linkedList.add("Am");
        linkedList.add("A");
        linkedList.add("Good");
        linkedList.add("Girl");
     System.out.println(linkedList);
     //Update element
        linkedList.set(3, "bad");
        System.out.println(linkedList);
        //remove element
        linkedList.remove(1);
        System.out.println(linkedList);
        //Iterate
        for (int i=0; i<linkedList.size();i++)
        {
            System.out.println(linkedList.get(i));
        }

    }
}
