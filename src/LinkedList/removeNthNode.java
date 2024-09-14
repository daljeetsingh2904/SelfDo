package LinkedList;

import LinkedList.sortArrayOf0s1s2s.Node;

public class removeNthNode {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static void removeNth(Node head,int n) {
    	Node temp=head;
    	Node prev=head;
    	 int count=countNode(head);
    	for(int i=count;i>0;i--) {
    		if(i==n) {
    			System.out.println(temp.data);
    			prev.next=temp.next;
    		}
    		prev=temp;
    		temp=temp.next;
    	}
    }
    
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static int countNode(Node head) {
    	Node temp=head;
    	int count=0;
    	while(temp!=null) {
    		count++;
    		temp=temp.next;
    	}
    	return count;
    }

    public static void main(String[] args) {
        // Creating a linked list with values 0, 1, 2 in random order
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // Printing original list
        System.out.println("Original List:");
        printList(head);


        removeNth(head, 2);
        // Printing sorted list
        System.out.println("After List:");
        printList(head);
    }

}
