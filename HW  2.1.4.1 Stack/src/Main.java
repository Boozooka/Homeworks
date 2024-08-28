public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(3);
        stack.push(5);
        stack.push(4);
        stack.printStack();
        System.out.println(stack.pop());
        stack.printStack();
    }
}
