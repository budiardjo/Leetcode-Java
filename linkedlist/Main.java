package linkedlist;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sLL = new SingleLinkedList();
        sLL.createSingleLinkedList(5);
        System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        System.out.println(sLL.head.next.next.value);
    }
}
