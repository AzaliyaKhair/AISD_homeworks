package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hw2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 5};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k)); // true
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (lastIndexMap.containsKey(num)) { // Если число уже встречалось, проверяем расстояние
                int lastIndex = lastIndexMap.get(num);
                if (Math.abs(i - lastIndex) <= k) {
                    return true;
                }
            }
            lastIndexMap.put(num, i);
        }

        return false;
    }
}