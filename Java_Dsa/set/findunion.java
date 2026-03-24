package Java_Dsa.set;

import java.util.TreeSet;

public class findunion {
    public static void main(String[] args) {
        int[] arr = {12, 23, 3, 12, 3, 5, 6};
        int[] arr1 = {2, 4, 3, 2, 7, 8, 9};

        TreeSet<Integer> set = new TreeSet<>();

        // Add elements of arr
        for (int num : arr) {
            set.add(num);
        }

        // Add elements of arr1
        for (int num : arr1) {
            set.add(num);
        }

        System.out.println("Union of arrays: " + set);
        System.out.println("samllest " +set.first());
        System.out.println("greatest " +set.last());
        System.out.println("higher " +set.higher(2));
        set.lower(3);
        set.ceiling(3);
        set.floor(3);
        set.subSet(2, 7);
        set.headSet(5);
        set.tailSet(6);
    }
}