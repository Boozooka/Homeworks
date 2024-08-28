public class Stack {
    private Node head;

    public void push(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node node = new Node(value, head);
            head = node;
        }
    }

    public int pop() {
        int value;
        if (head == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            value = head.value;
            head = head.prev;
        }
        return value;
    }

    public void printStack() {
        if (head == null) {
            System.out.println("EMPTY");
        } else {
            Node node = head;
            while (node != null) {
                System.out.print(node.value);
                if (node.prev != null) {
                    System.out.print(" -> ");
                }
                node = node.prev;
            }
            System.out.println();
        }
    }
}
