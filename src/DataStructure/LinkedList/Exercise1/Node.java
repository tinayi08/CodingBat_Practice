package DataStructure.LinkedList.Exercise1;

public class Node<T extends Item> {

    T item;
    Node next;
    Node previous;

    public Node(T item) {
        this.item = item;

    }

}
