import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    // Constructor
    public QueueUsingStacks() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int x) {
        stackEnqueue.push(x);
        System.out.println(x + " enqueued.");
    }

    // Dequeue operation
    public int dequeue() {
        if (stackDequeue.isEmpty()) {
            if (stackEnqueue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Transfer all elements from stackEnqueue to stackDequeue
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        int removed = stackDequeue.pop();
        System.out.println(removed + " dequeued.");
        return removed;
    }

    // Peek operation (optional)
    public int peek() {
        if (stackDequeue.isEmpty()) {
            if (stackEnqueue.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        return stackDequeue.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        queue.dequeue();
        queue.enqueue(40);
        
        System.out.println("Front element: " + queue.peek());
        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }
}