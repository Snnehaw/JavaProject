package CollectionInterface;

import java.util.ArrayList;

public class MaxMinArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add(13);
        Arr.add(23);
        Arr.add(33);
        Arr.add(43);
        Arr.add(53);
        Arr.add(3);

        System.out.println(Arr);

        int min = Arr.get(0);
        int max = Arr.get(0);
        int n = Arr.size();
        for (int i = 1; i < n; i++) {
            if (Arr.get(i) > max) {
                max = Arr.get(i);
            }
        }
        for (int i = 1; i < n; i++) {
            if (Arr.get(i) < min) {
                min = Arr.get(i);
            }
        }
        System.out.println("Maximum is : " + max);
        System.out.println("Minimum is : " + min);

    }
}
