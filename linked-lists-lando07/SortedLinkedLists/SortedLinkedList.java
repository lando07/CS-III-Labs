import java.util.NoSuchElementException;

public class SortedLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SortedLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int n) {
        if (head == null) {
            head = tail = new Node(n, null, null);
        } else if (n <= head.data) {
            Node node = new Node(n, null, head);
            head.prev = node;
            head = node;
        } else if (n >= tail.data) {
            Node node = new Node(n, tail, null);
            tail.next = node;
            tail = node;
        } else {
            Node nextNode = head;
            while (n > nextNode.data) {
                nextNode = nextNode.next;
            }
            Node prevNode = nextNode.prev;
            Node node = new Node(n, prevNode, nextNode);
            prevNode.next = node;
            nextNode.prev = node;
        }
        size++;

    }

    public void addAll(int[] ns) {
        for (int i : ns) {
            add(i);
        }
    }

    public int removeFront() {
        if (size == 0)
            throw new NoSuchElementException();
        Node oldHead = head;
        if (size == 1) {
            head = tail = null;
            size = 0;
            return oldHead.data;
        }
        head = head.next;
        head.prev = null;
        size--;
        return oldHead.data;
    }

    public int peekFront() {
        if(size == 0)
            throw new NoSuchElementException();
        return head.data;
    }

    public int removeBack() {
        if (size == 0)
            throw new NoSuchElementException();
        Node oldTail = tail;
        if (size == 1) {
            head = tail = null;
            size = 0;
            return oldTail.data;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
        return oldTail.data;
    }

    public int peekBack() {
        if(size == 0)
            throw new NoSuchElementException();
        return tail.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        if (head == null)
            return "[]";
        StringBuilder res = new StringBuilder("[");
        res.append(head.data);
        Node nextNode = head.next;
        while (nextNode != null) {
            res.append(", " + nextNode.data);
            nextNode = nextNode.next;
        }
        res.append(']');
        return res.toString();
    }

    private static class Node {
        private int data;

        private Node prev;
        private Node next;

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }

}
