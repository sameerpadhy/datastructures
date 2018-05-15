package com.sameer.list;


class Node{
	int value;
	Node next;
	public Node(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}


public class LinkedList {
	
	Node head;
	
	public void addFirst(Node node){
		if(head==null){
			head=node;
		}else {
			Node temp=head;
			head=node;
			head.setNext(temp);	
		}
		
	}
	
	public void addLast(Node node){
		if(head==null){
			head=node;
		}else{
			Node current=head;
			while(current.next!=null){
				current=current.getNext();
			}
			current.setNext(node);
			
		}
		
	}
	
	public void removeFirst(){
		if(head==null){
			throw new RuntimeException("List doesn't hve any elements");
		}else{
			Node temp=head.getNext();
			head=temp;
		}
	}
	public void removeLast(){
		if(head==null){
			throw new RuntimeException("List doesn't hve any elements");
		}else{
			Node current=head;
			while (current.next.next != null) {
				current = current.next;
		    }
			current.next = null;
		
	}
	}
	public void printList(Node current){
		while(current!=null){
			System.out.println(current.getValue());
			current=current.getNext();
		}
	}

	public static void main(String[] args) {
		Node first=new Node(3);
		Node middle=new Node(5);
		Node last=new Node(7);
		first.setNext(middle);
		middle.setNext(last);
		
		LinkedList ll=new LinkedList();
		ll.head=first;
		System.out.println("----printList----");
		ll.printList(first);
		
		System.out.println("----addFirst----");
		ll.addFirst(new Node(1));
		ll.printList(ll.head);
		
		System.out.println("---removeFirst-----");
		ll.removeFirst();
		ll.printList(ll.head);
		
		System.out.println("-----addLast---");
		ll.addLast(new Node(9));
		ll.printList(ll.head);
		
		System.out.println("-----removeLast---");
		ll.removeLast();
		ll.printList(ll.head);
	}

}
