
public class MyLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }



    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;

        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node<T> current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }


    public T removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        T removedData = head.data;
        head = head.next;
        size--;

        return removedData;
    }

    public int size() {
        return size;
    }



    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }




    private Node<T> head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void reverse() {
        Node<T> previous = null;
        Node<T> current = head;

        while (current != null) {
            Node<T> nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;
    }
    public T findMiddle() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}
