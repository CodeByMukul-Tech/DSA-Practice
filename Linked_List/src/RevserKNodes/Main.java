package RevserKNodes;

import java.util.*;

class Node {
    int val;
    Node next;

    Node(int d) {
        val = d;
        next = null;
    }
}

class LinkedList {
    Node head, tail;

    void push(Node new_node) {
        if (head == null && tail == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {

    public Node Reverse(Node head , int k){
        int count = 0 ;
        Node curr = head;
        Node next = null;
        Node prev = null;
        while (curr!=null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        if(next != null){
            head.next = Reverse(next , k);
        }

        return  prev;

    }
    public int size(Node head){
        if(head == null) return 0 ;
        if(head.next == null ) return  1;
        else{
            return  1+size(head.next);
        }
    }

    public Node reverseKGroup(Node head, int k) {
        Node curr = head;
        if(head == null || head.next == null) return  head;

        if(size(curr)< k){
           return  head;

        }
        return Reverse(curr, k);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList llist = new LinkedList();
        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);
        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }
        Solution Obj = new Solution();
        head = Obj.reverseKGroup(head, k);
        llist.printList(head);
        sc.close();
    }
}