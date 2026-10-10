
public class MyQueue<T> {

    private MyStack<T> stack1;
    private MyStack<T> stack2;

    public MyQueue() {
        stack1 = new MyStack<>();
        stack2 = new MyStack<>();
    }

    // Add an item to the queue
    public void enqueue(T item) {
        stack1.push(item);
    }

    // Move items to stack2 when needed
    private void transferItems() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    // Remove and return the oldest item
    public T dequeue() {
        transferItems();

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.pop();
    }

    // View the oldest item without removing it
    public T peek() {
        transferItems();

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.peek();
    }
}
