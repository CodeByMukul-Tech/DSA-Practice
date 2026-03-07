package InsertSpecificLocation;

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static Node insert(Node head, int n, int pos, int val) {
        Node curr = head;
        Node node = new Node(val);
        if (curr == null) {
            return head;
        } else if (curr.next == null) {

            curr.next = node;
        } else{
            int idx = 0;
            while (curr != null && idx < pos-1) {
                curr = curr.next;
                idx++;
            }
          node.next = curr.next;
            curr.next = node;
        }

        return head;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int val = sc.nextInt();
        int pos = sc.nextInt();
        Node head = Solution.insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}