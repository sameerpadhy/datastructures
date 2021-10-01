package com.sameer.tree;

import java.util.LinkedList;
import java.util.List;
public class LevelOrderTraversalLevelByLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree bt=new Tree();
		Node node=new Node(5);
		bt.root=node;
		bt.root.value=5;
		bt.addRecursive(bt.root, 3);
		bt.addRecursive(bt.root, 7);
		bt.addRecursive(bt.root, 1);
		bt.addRecursive(bt.root, 10);
		//inOrder(bt.root);
		printLevelByLevel(bt.root);
		
	}
	
	public static void inOrder(Node current) {
		if(current==null)
			return;
		System.out.println(current.getValue());
		inOrder(current.getLeft());
		inOrder(current.getRight());
		
	}
	
	public static void printLevelByLevel(Node root) {
		if(root==null) {
			return;
		}
		List<Node> queue=new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node temp=queue.remove(0);
			if(temp==null) {
				System.out.println("One level over");
				queue.add(null);
				continue;
			}
			System.out.println(temp.value);
			if(temp.getLeft()!=null) {
				queue.add(temp.getLeft());
			} if(temp.getRight()!=null) {
				queue.add(temp.getRight());
			}
		}
	}

}
