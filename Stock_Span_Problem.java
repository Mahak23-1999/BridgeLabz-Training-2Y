import java.util.*;

class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>(); // stack to store indices

        for (int i = 0; i < n; i++) {
            // Pop indices of prices smaller than or equal to current price
            while (!s.isEmpty() && prices[s.peek()] <= prices[i]) {
                s.pop();
            }

            // Calculate span
            if (s.isEmpty()) {
                span[i] = i + 1; // All previous prices are smaller
            } else {
                span[i] = i - s.peek();
            }

            // Push current index
            s.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);

        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Stock Spans : " + Arrays.toString(spans));
    }
}