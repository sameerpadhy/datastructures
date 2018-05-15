package com.sameer.doublelist;

import com.sameer.list.LinkedList;
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
public class DoubleLinkedList {
	
	Node head;
	Node tail;
	
	public void printList(){
		Node current=head;
		while(current!=null){
			System.out.println(current.getValue());
			current=current.getNext();
		}
	}
	
	public void addFirst(Node node){
		if(head==null && tail==null){
			this.head=node;
			this.tail=node;
		}else{
			Node temp=head;
			head=node;
			head.setNext(temp);
		}
	}
	
	public void addLast(Node node){
		tail.setNext(node);
		tail=node;
	}
	
	public void removeFirst(){
		if(head==null && tail==null){
			throw new RuntimeException("Empty list");
		}else if(head==tail){
			head=null;
			tail=null;
		}else{
			head=head.getNext();
		}
	}
	
	public void removeLast(){
		if(head==null && tail==null){
			throw new RuntimeException("Empty list");
		}else if(head==tail){
			head=null;
			tail=null;
		}else{
			Node current=null;
			for(current=head;current.getNext().getNext()!=null;current=current.getNext()){
				
			}
			current.setNext(null);
		}
	}


	public static void main(String[] args) {
		Node first=new Node(3);
		Node middle=new Node(5);
		Node last=new Node(7);
		
		DoubleLinkedList dl=new DoubleLinkedList();
		//dl.head=first;
		System.out.println("----add first----");
		dl.addFirst(middle);
		dl.addFirst(first);
		dl.printList();
		
		System.out.println("----add last----");
		dl.addLast(last);
		dl.printList();
		
		System.out.println("----remove fast----");
		dl.removeFirst();
		dl.printList();
		
		System.out.println("----remove last----");
		dl.removeLast();
		dl.printList();

	}

}
