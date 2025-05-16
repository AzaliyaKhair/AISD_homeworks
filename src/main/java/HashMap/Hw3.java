package HashMap;

import java.util.*;

public class Hw3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 4, 1};
        int[] arr2 = {2, 2, 4, 5};

        int[] result = findCommonElements(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        Map<Integer, Integer> countMap1 = new HashMap<>();
        for (int num : arr1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            if (countMap1.containsKey(num) && countMap1.get(num) > 0) {
                result.add(num);
                countMap1.put(num, countMap1.get(num) - 1);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
