package com.test;

public class ReversalSinglyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node=new ListNode(1); 
		node.next=new ListNode(2);
		node.next.next=new ListNode(3);
		node.next.next.next=null;
		printList(node);
		ListNode listrreversed=reverseList(node);
		System.out.println("After reversing");
		printList(listrreversed);
		
	}
	 public static void printList(ListNode node) {
		 ListNode temp = node;
	        while (temp != null) {
	            System.out.print(temp.val + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	 public static ListNode reverseList(ListNode head) {
	        ListNode prev=null;
	       ListNode current=head;
	        while(current!=null)
	        {
	       ListNode temp=current.next;
	       current.next=prev;
	       prev=current;
	       current=temp;
	        }
	        return prev;
	    }
}

class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
