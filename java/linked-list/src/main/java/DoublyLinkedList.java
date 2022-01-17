public class DoublyLinkedList<T> {
    
    private Node<T> head = null;
    private Node<T> tail = null;

    public void push(T value){
        Node<T> newNode = new Node<>(value);
        if(this.head == null) {
            this.head = newNode; 
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
        }
        this.tail = newNode;
    }

    public T pop(){
        if(this.tail == null){
            return null;
        }
        T value = this.tail.value;
        this.tail = this.tail.previous;
        return value;
    }

    public T shift(){
        if(this.head == null){
            return null;
        }
        T value = this.head.value;
        this.head = this.head.next;
        return value;
    }
    
    public void unshift (T value){
        Node<T> newNode = new Node<>(value);
        if(this.head == null) {
            this.tail = newNode; 
        } else {
            this.head.previous = newNode;
            newNode.next = this.head;
        }
        this.head = newNode;
    }

    private static class Node<T> {
        Node<T> previous = null;
        T value;
        Node<T> next = null;

        Node (T value) {
            this.previous = null;
            this.value = value;
            this.next = null;
                }
    }
    
    
}