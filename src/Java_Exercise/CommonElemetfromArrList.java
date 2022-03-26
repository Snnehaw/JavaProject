package Java_Exercise;
import java.util.*;
public class CommonElemetfromArrList {

    public static void main(String[] args)
    {
        int arr1[]={23, 25, 46,98};
        int arr2[] ={55, 67, 98, 46};
       int c=0;
        for(int i=0; i<4;i++)
        {
            for(int j=0; j<4;j++)
            {
                if(arr1[i]==arr2[j])
                     c=arr2[j];


            }
            System.out.println(+c);
        }


    }
}
