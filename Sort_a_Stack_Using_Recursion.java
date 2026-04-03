import java.util.Stack;

class SortStackUsingRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack); // Recursively sort remaining stack
            insertSorted(stack, top); // Insert popped element in sorted order
        }
    }

    // Helper function to insert element in sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or element is greater than top
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // Pop the top and recursively insert the element
        int top = stack.pop();
        insertSorted(stack, element);

        // Push the previous top back
        stack.push(top);
    }

    // Utility function to print stack
    public static void printStack(Stack<Integer> stack) {
        for (int num : stack) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack:");
        printStack(stack);

        sortStack(stack);

        System.out.println("Sorted Stack (Ascending):");
        printStack(stack);
    }
}