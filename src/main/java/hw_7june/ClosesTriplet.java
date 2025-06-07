package hw_7june;
import java.util.Arrays;

public class ClosesTriplet {
    public static int[] findClosestTriplet(int[] arr, int t) {
        Arrays.sort(arr);
        int n = arr.length;
        int bestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int[] bestTriplet = new int[3];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                int currentDiff = Math.abs(currentSum - t);

                if (currentDiff < minDiff) {
                    minDiff = currentDiff;
                    bestSum = currentSum;
                    bestTriplet[0] = arr[i];
                    bestTriplet[1] = arr[left];
                    bestTriplet[2] = arr[right];
                }

                if (currentSum < t) {
                    left++;
                } else if (currentSum > t) {
                    right--;
                } else {
                    return bestTriplet;
                }
            }
        }
        return bestTriplet;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int t = 1;
        int[] result = findClosestTriplet(arr, t);
        System.out.println(Arrays.toString(result));
    }
}
