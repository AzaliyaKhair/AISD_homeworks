package Lab_2;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] queue1 = {1, 3, 5};
        int[] queue2 = {2, 4, 6};

        int[] queue = queues (queue1, queue2);
        System.out.println("очередь: " + Arrays.toString(queue));
    }

    public static int[] queues(int[] queue1, int[] queue2) {
        int n1 = queue1.length;
        int n2 = queue2.length;
        int[] queue = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (queue1[i] <= queue2[j]) {
                queue[k++] = queue1[i++];
            } else {
                queue[k++] = queue2[j++];
            }
        }
        while (i < n1) {
            queue[k++] = queue1[i++];
        }
        while (j < n2) {
            queue[k++] = queue2[j++];
        }

        return queue;
    }
}
