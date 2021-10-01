package com.sameer.stack;

public class Stack {
	
	Node top;
	
	public boolean isEmpty() {
		if(top==null)return true;
		else return false;
	}
	
	public void push(int value) {
		if(isEmpty()) {
			top=new Node(value);
			return;
		}
		Node temp=top;
		top=new Node(value);
		top.setNext(temp);
	}
	
	public Node pop() {
		if(top==null)return null;
		Node temp=top;
		top=top.getNext();
		return temp;
	}
	
	public Node peek() {
		if(isEmpty())return null;
		else return top;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack=new Stack();
		stack.push(3);
		stack.push(5);
		stack.push(7);
		
		
		//System.out.println(stack.peek().value);
		
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		System.out.println(stack.pop().value);
		
		
		

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
