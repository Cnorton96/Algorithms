package Recursion;

public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        new_node.next = null;
        
        if (list.head == null) {
            list.head = new_node;
        }else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static LinkedList swapPairs(LinkedList list){
        if((list.head == null) || (list.head.next == null)){
            return list;
        }

        Node firstNode = list.head;
        Node secondNode = list.head.next;
        return list;


    }

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList = insert(linkedList, 1);
        linkedList = insert(linkedList, 2);
        linkedList = insert(linkedList, 3);
        linkedList = insert(linkedList, 4);

        printList(linkedList);
        System.out.println(swapPairs(linkedList));

    }
}
