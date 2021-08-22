package CollectionInterface;
import java.util.*;

public class Class1 {

    public static void main(String[] args)
    {
        /*String[] arr =new String[2];//Standard Array initialization in java
        for (int i=0; i<3;i++)
        {
            arr[i]="Hello";
        }*/
        //for the above program we will get the ArrayIndexOutOfBoundException to solve this problem we use Arraylist

        ArrayList<Integer> arrList=new ArrayList<>(); //without importing arraylist class we cannot proceed directly
//Class ArrayList implements List interface
        //Note:Here we can use only reference types and cannot use Primitive Types

        //Now add elements to ArrayList Collection through Object
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);

        System.out.println(arrList);
        System.out.println(arrList.get(5));
        System.out.println(arrList.size());

        for(int i=0;i<arrList.size();i++)
        {
             System.out.println(arrList.get(i));
        }

        for (Integer a: arrList)
        {
            System.out.println(a);
        }

//remove element from Array
        arrList.remove(2);
        System.out.println(arrList);
        //note: it is not sufficient to use remove method if you want to remove an element  near to the begining, specially if you have a large arraylist
//to slove the above note linked list came into picture

    }
}
