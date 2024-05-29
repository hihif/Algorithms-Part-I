import java.util.*;

public class myStack {
    private Node first = null;
    private class Node {
        int item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(int item) {
        Node tmp = first;
        first = new Node();
        first.item = item;
        first.next = tmp;
    }

    public int pop() {
        int item = first.item;
        first = first.next;
        return item;
    }

    public int max() {
        if (isEmpty())
            throw new NoSuchElementException("Stack is Empty");
        
        int max = first.item;
        Node current = first.next;
        while (current != null) {
            if (max < current.item)
                max = current.item;
            current = current.next; 
        }
        return max;
    }

    // Tests
    public static void main(String[] args) {
        myStack test = new myStack();
    
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(-1);
        test.push(1);
    
        System.out.println(test.max());
    }
}