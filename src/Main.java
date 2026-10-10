
public static void main(String[] args) {

    MyStack<Integer> stack = new MyStack<>();

    stack.push(10);
    stack.push(20);

    System.out.println("Stack top: " + stack.peek());
    System.out.println("Stack pop: " + stack.pop());

    MyQueue<Integer> queue = new MyQueue<>();

    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);

    System.out.println("Queue peek: " + queue.peek());
    System.out.println("Queue dequeue: " + queue.dequeue());

    System.out.println(
            "Balanced {[()]}: " +
                    BalancedBrackets.isBalanced("{[()]}")
    );

    System.out.println(
            "Balanced ([)]: " +
                    BalancedBrackets.isBalanced("([)]")
    );


    MyLinkedList<Integer> list = new MyLinkedList<>();

            list.addFirst(20);
            list.addFirst(10);
            list.addLast(30);
            list.addLast(40);

            System.out.println("Size: " + list.size());
            System.out.println("Item at index 1: " + list.get(1));
            System.out.println("Middle item: " + list.findMiddle());

            list.reverse();

            System.out.println("After reversing:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
    MyQueue<Integer> queueTest = new MyQueue<>();

    queueTest.enqueue(10);
    queueTest.enqueue(20);
    queueTest.enqueue(30);

    System.out.println("First: " + queueTest.dequeue());
    System.out.println("Second: " + queueTest.dequeue());
    System.out.println("Third: " + queueTest.dequeue());

            System.out.println("Removed item: " + list.removeFirst());
            System.out.println("New size: " + list.size());

    int[] numbers = {1, 2, 3, 4, 5};
    ArrayStringAlgorithms.rotateRight(numbers, 2);
    System.out.println(
            "Rotated: " + java.util.Arrays.toString(numbers)
    );
    LRUCache lru = new LRUCache(2);

    lru.put(1, 100);
    lru.put(2, 200);

    System.out.println("Get 1: " + lru.get(1));

    lru.put(3, 300);

    System.out.println("Get 2: " + lru.get(2));
    System.out.println("Get 3: " + lru.get(3));
    System.out.println(
            "Anagram: " +
                    ArrayStringAlgorithms.isAnagram("listen", "silent")
    );

    int[] sorted = {1, 2, 4, 6, 8};
    int[] pair = ArrayStringAlgorithms.twoSumSorted(sorted, 10);
    System.out.println(
            "Two sum indices: " + java.util.Arrays.toString(pair)
    );




}
