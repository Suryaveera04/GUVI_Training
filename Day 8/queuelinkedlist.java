import java.io.*;
import java.util.*;
import java.util.Arrays;


class Node{ // speacial variable
    int data;
    Node next;
    public Node(int d){
        data = d;
        next = null;
    }
}

public class queuelinkedlist {
     public static void insertAtEnd(Node head, int d){
        Node newNode = new Node(d);
        Node temp = head;
        while(temp.next != null){
            temp =temp.next;
        }
        temp.next = newNode;
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
            }
        System.out.print("null");
    }
    public static Node insertAtBeginning(Node head, int d){
        Node newNode = new Node(d);
        newNode.next = head;
        return newNode;
    }
    public static void deleteNode(Node head, int d){
        Node temp = head;
        while(temp.next.data != d){
            if(temp == null){
                System.out.println("node doesn't exist");
                return;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        }
    public static int[] middleNode(Node head){
        Node fast = head, slow = head, prev = null;
        while(fast != null && fast.next != null ){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast == null){
            return new int[]{prev.data, slow.data}; // returns middle of LL
        }
        else{
            return new int[]{slow.data};
        }
        
    }
    int getKthFromLast(Node head, int k){
        Node fast = head, slow = head;
        for(int i = 1; i<=k; i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
           Node head = new Node(3);
           insertAtEnd(head, 6);
           insertAtEnd(head, 1);
           insertAtEnd(head, 4);
           insertAtEnd(head, 0);
           insertAtEnd(head, 2);
           insertAtEnd(head, 16);
           head = insertAtBeginning(head, 1);
           printLL(head);
           deleteNode(head, 0);
           printLL(head);
           
           System.out.println(Arrays.toString(middleNode(head)));
           System.out.println(new queuelinkedlist().getKthFromLast(head, 2));
        
}
}

