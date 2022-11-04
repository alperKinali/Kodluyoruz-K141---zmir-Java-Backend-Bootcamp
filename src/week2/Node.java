package week2;

public class Node <T>{

    private  T value;
    // değiişkeni tutması için
    // her node bir bir sonraki nodu göstemrmer ş
    private Node<T> next;
    private Node<T> prev;

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    private  Priority priority;

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Node(T value, Node<T> next, Node<T> prev, Priority priority) {
        this.value = value;
        this.next = next;
        this.prev = prev;
        this.priority = priority;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
