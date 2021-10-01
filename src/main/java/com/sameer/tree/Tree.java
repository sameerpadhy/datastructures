package com.sameer.tree;

public class Tree {
	
	Node root;
	
	
	public void add(int value) {
		 addRecursive(root, value);
	}
	public void addRecursive(Node current, int value) {
		if(current==null) {
			this.root= new Node(value);
		} if(value<current.value) {
			//addRecursive(current.left,value);
			if(current.left==null) {
				current.left=new Node(value);
			}else
			{
				addRecursive(current.left, value);
			}
		}
		else if(value>current.value) {
			if(current.right==null) {
				current.right=new Node(value);
			}else
			{
				addRecursive(current.right, value);
			}
		}
		//return null;
	}
	public void preOrder(Node node) {
		if(node==null) {
			return ;
		}
		System.out.println(node.getValue());
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public void InOrder(Node node) {
		if(node==null) {
			return ;
		}
		InOrder(node.left);
		System.out.println(node.getValue());
		InOrder(node.right);
	}
	
	public void postOrder(Node node) {
		if(node==null) {
			return ;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.getValue());
	}

	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public static void main(String[] args) {
		Tree bt=new Tree();
		Node node=new Node(5);
		bt.root=node;
		bt.root.value=5;
		bt.addRecursive(bt.root, 3);
		bt.addRecursive(bt.root, 7);
		//bt.root.setLeft(bt.root.);
		//bt.root.setRight(new Node(5));
		System.out.println("PreOrder Traversal");
		bt.preOrder(bt.getRoot());
		System.out.println("InOrder Traversal");
		bt.InOrder(bt.getRoot());
		System.out.println("PostOrder Traversal");
		bt.postOrder(bt.getRoot());
		
	}

}

class Node{
	int value;
	Node left, right;
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
