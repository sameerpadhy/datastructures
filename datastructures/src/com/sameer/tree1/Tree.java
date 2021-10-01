package com.sameer.tree1;

public class Tree {
	
	Node root;
	
	public void add(int data) {
		this.addRecursive(data, root);
	}

	private void addRecursive(int data, Node current) {
		if(current==null) {
			this.root=new Node(data);
			return;
			
		}
		if(data<current.getData()) {
			if(current.getLeft()==null)
				current.left=new Node(data);
			else
				addRecursive(data, current.getLeft());
		}
		else {
			if(current.getRight()==null)
				current.right=new Node(data);
			else
				addRecursive(data, current.getRight());
		}
		//return current;
		
	}
	
	public void preOrder(Node current) {
		if(current==null) {
			return;
		}
		System.out.println(current.getData());
		preOrder(current.getLeft());
		preOrder(current.getRight());
	}
	
	
	public void InOrder(Node current) {
		if(current==null) {
			return;
		}
		InOrder(current.getLeft());
		System.out.println(current.getData());
		InOrder(current.getRight());
	}
	
	public void PostOrder(Node current) {
		if(current==null) {
			return;
		}
		PostOrder(current.getLeft());
		System.out.println(current.getData());
		PostOrder(current.getRight());
	}
	
	public static int treeHeight(Node current) {
		int leftHeight=0;
		int rightHeight=0;
		if(current.getLeft()!=null) {
			leftHeight=1+treeHeight(current.getLeft());
		}else {
			rightHeight=1+treeHeight(current.getRight());
		}
		return (leftHeight>rightHeight)? leftHeight:rightHeight;
		
	}
	public static void main(String []args) {
		Tree t=new Tree();
		t.add(3);
		t.add(5);
		t.add(1);
		System.out.println("added");
		t.preOrder(t.root);
		System.out.println("inorder");
		System.out.println("postorder");
		
		System.out.println(treeHeight(t.root));
	}

}

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		super();
		this.data = data;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
