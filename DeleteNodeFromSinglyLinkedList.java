package com.test;

public class DeleteNodeFromSinglyLinkedList {


	    // Function to delete the first node with given key
	    public static Node deleteNode(Node head, int key) {

	        // Case 1: If list is empty
	        if (head == null) {
	            return head;
	        }

	        // Case 2: If head node itself holds the key
	        if (head.data == key) {
	            return head.next;  // Move head to next node
	        }

	        Node curr = head;  // Pointer to traverse the list
	        Node prev = null;  // Pointer to store previous node

	        // Traverse the list to find the node to delete
	        while (curr != null && curr.data != key) {
	            prev = curr;
	            curr = curr.next;
	        }

	        // Case 3: Key not found, reached the end
	        if (curr == null) {
	            return head;
	        }

	        // Case 4: Node found → unlink it
	        else
	        {
	         prev.next = curr.next;
	        }
	        return head;
	    }

	    // Helper function to print the list
	    public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    public static void main(String[] args) {
	        // Creating linked list: 1 -> 2 -> 3 -> 4
	        Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);

	        System.out.print("Original list: ");
	        printList(head);

	        // Delete node with value 3
	        head = deleteNode(head, 3);

	        System.out.print("After deletion: ");
	        printList(head);
	    }
	
}
class Node {
    int data;       // Value stored in the node
    Node next;      // Reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
