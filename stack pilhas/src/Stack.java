public class Stack<T> {
    private T[] data;
    private int top = -1;

    public Stack(int size) {
        data = (T[]) new Object[size];
    }

    public void push(T element) {
        if (top == data.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        data[++top] = element;
    }

    public T pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
