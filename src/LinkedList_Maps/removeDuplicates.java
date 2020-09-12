package LinkedList_Maps;

import java.util.HashSet;

/* Consider an unsorted singly linked list of integers. Write a snippet of code that removes the duplicates. */
class Node{
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    }
}
public class removeDuplicates {
    static Node head;

    //This appriacg runs in constant time thanks to the hashset we are using.
    public Node removeDuplicates(Node head){
        HashSet<Integer> set = new HashSet<Integer>();
        Node current = head;
        Node prev = null;
        while(current.next != null){
            if(set.contains(current.data)){
                prev.next = current.next;
            }else{
                set.add(current.data);
                prev = current;
            }
            current = current.next;
        }
        return current;
    }

    //This approach will use the runners technique for removing the duplicates.
    public Node removeDups(Node head){
        Node current = head;
        if(current == null){
            return null;
        }

        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return current;

    }







    public static void main(String[] args){

    }
}
