import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache;

    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be greater than zero"
            );
        }

        this.capacity = capacity;
        this.cache = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void moveToFront(Node node) {
        removeNode(node);
        addToFront(node);
    }

    public int get(int key) {
        Node node = cache.get(key);

        if (node == null) {
            return -1;
        }

        moveToFront(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);

        if (node != null) {
            node.value = value;
            moveToFront(node);
            return;
        }

        if (cache.size() == capacity) {
            Node leastRecent = tail.prev;
            removeNode(leastRecent);
            cache.remove(leastRecent.key);
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        addToFront(newNode);
    }
}