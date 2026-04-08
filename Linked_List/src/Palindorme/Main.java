package Palindorme;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList();
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++)
        {
            int a = sc.nextInt();
            llist.addToTheLast(new Node(a));
        }
        Solution A = new Solution();
        System.out.println(A.isPalindrome(llist.head));
    }
}

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

class LinkedList
{
    Node head;
    Node tail;
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Solution{

    public Node ReverseAlgo(Node head){
        Node prev = null;
        Node next ;
        Node curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    boolean isPalindrome(Node head)
 {
        Node curr = head;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node reverseal = ReverseAlgo(slow);
        while(curr!=null){
            if(curr.data != reverseal.data){
                return false;
            }
            reverseal=reverseal.next;
            curr = curr.next;

        }

        return true;
}

}