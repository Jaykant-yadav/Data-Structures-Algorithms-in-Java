package DSA.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrListQs {
    // Reverse ArrayList
    public static void reverseArrList(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    // Find Maximum in an ArrayList
    public static void findMaxNum(ArrayList<Integer> list) {
        int MaxNum = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            MaxNum = Math.max(MaxNum, list.get(i));
        }

        System.out.println("Maximum Number : " + MaxNum);
    }

    // Swap 2 Numbers
    public static void swapTwoNum(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // Container with Most Water
    // Brute Force - O(n^2)
    public static void mostWater(int height[]) {
        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]);
                int width = j - i;
                int currWater = minHeight * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        System.out.println("Most Water : " + maxWater);
    }

    // Two Pointer Approach - O(n)
    public static void mostWater2(int height[]) {
        int first = 0, last = height.length - 1;
        int maxWater = 0;
        while (first <= last) {
            int minHeight = Math.min(height[first], height[last]);
            int width = last - first;
            int currWater = minHeight * width;
            maxWater = Math.max(maxWater, currWater);
            if (height[first] < height[last]) {
                first++;
            } else {
                last--;
            }
        }

        System.out.println("Most Water : " + maxWater);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(31);
        list.add(4);
        list.add(5);

        // reverseArrList(list);
        // findMaxNum(list);
        /*
         * int idx1 = 1, idx2 = 3;
         * System.out.println(list);
         * swapTwoNum(list, idx1, idx2);
         * System.out.println(list);
         */

        // System.out.println(list);
        Collections.sort(list); // ascending
        // System.out.println(list);

        // Descending
        Collections.sort(list, Collections.reverseOrder()); // Comprator
        // System.out.println(list);

        // Multi-Dimentional ArrayList
        /*
         * ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
         * ArrayList<Integer> lists = new ArrayList<>();
         * lists.add(1);
         * lists.add(2);
         * mainList.add(lists);
         * 
         * ArrayList<Integer> lists2 = new ArrayList<>();
         * lists2.add(3);
         * lists2.add(4);
         * mainList.add(lists2);
         * 
         * for(int i=0; i<mainList.size(); i++){
         * ArrayList<Integer> currList = mainList.get(i);
         * for(int j=0; j<currList.size(); j++){
         * System.out.print(currList.get(j) + " ");
         * }
         * System.out.println();
         * }
         * 
         * System.out.println(mainList);
         */

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // mostWater(height);
        mostWater2(height);

    }
}
