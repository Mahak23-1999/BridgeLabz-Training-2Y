import java.util.*;

class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if (arr == null || k <= 0) return new int[0];
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of current window
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }

            // Add current element index
            dq.offerLast(i);

            // Record the maximum for this window
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] maxes = maxSlidingWindow(arr, k);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Sliding Window Maximums: " + Arrays.toString(maxes));
    }
}