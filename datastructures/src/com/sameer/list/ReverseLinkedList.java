package com.sameer.list;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		ll.addLast(first);
		ll.addLast(second);
		ll.addLast(third);
		ll.addLast(fourth);
		ll.addLast(fifth);
		
		ll.printList(ll.head);
		System.out.println("After reversal");
		ll.head=reverseLinkedList(ll.head);
		ll.printList(ll.head);
		//ll.printList(reverseLinkedList(ll.head));

	}
	
	
	private static Node reverseLinkedList(Node head) {
		if(head==null)return null;
		Node previous=null;
		Node current=null;
		Node next=head;
		
		while(next!=null) {
			current=next;
			next=next.getNext();
			current.setNext(previous);
			previous=current;
		}
		head=current;
		return head;
	}

}
