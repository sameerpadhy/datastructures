package com.sameer.queue;



public class Queue {
	
	Node head,tail;
	
	public void enque(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=head;
		}
		else {
			tail.setNext(newNode);
			tail=newNode;
		}
	}
	
	public Node deque() {
		if(head==null) return null;
		Node temp=head;
		head=head.getNext();
		return temp;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue=new Queue();
		queue.enque(3);
		queue.enque(5);
		queue.enque(7);
		
		System.out.println(queue.deque().value);
		System.out.println(queue.deque().value);
		System.out.println(queue.deque().value);

	}

}
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