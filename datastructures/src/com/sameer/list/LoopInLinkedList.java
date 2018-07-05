package com.sameer.list;

public class LoopInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node loopNode=new Node(4);
		Node fifth=new Node(5);
		
		ll.addLast(first);
		ll.addLast(second);
		ll.addLast(third);
		ll.addLast(loopNode);
		ll.addLast(fifth);
		ll.addLast(loopNode);
		
		
		System.out.println(ifLoopExists(ll.head));
		//ll.printList(ll.head);
		

	}
	
	
	public static boolean ifLoopExists(Node head) {
		  Node fastPtr = head;
		  Node slowPtr = head;
		  while (fastPtr != null && fastPtr.next != null) {
		   fastPtr = fastPtr.next.next;
		   slowPtr = slowPtr.next;
		   if (slowPtr == fastPtr)
		    return true;
		 
		  }
		  return false;
		 }

}
