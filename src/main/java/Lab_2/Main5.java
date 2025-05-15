package Lab_2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main5 {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 2, 10, 8};
        int[] result = findNearestSmallerIndices(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findNearestSmallerIndices(int[] numbers) {
        int length = numbers.length;
        int[] nearestIndices = new int[length];
        Queue<Integer> indexQueue = new LinkedList<>();

        for (int i = 0; i < length; i++) {
            while (!indexQueue.isEmpty() && numbers[i] >= numbers[indexQueue.peek()]) {
                indexQueue.poll();
            }
            if (!indexQueue.isEmpty()) {
                nearestIndices[i] = indexQueue.peek(); 
            } else {
                nearestIndices[i] = 0; // Если нет меньшего элемента, сохраняем 0
            }
            indexQueue.offer(i);
        }

        return nearestIndices;
    }
}