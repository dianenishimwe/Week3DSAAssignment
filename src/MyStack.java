public class MyStack<T> {

    private MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        if (list.size() == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}