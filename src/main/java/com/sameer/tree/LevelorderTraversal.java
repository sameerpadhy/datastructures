package com.sameer.tree;

import java.util.ArrayList;
import java.util.List;

public class LevelorderTraversal {

	public static void main(String[] args) {
		Tree bt=new Tree();
		Node node=new Node(5);
		bt.root=node;
		bt.root.value=5;
		bt.addRecursive(bt.root, 3);
		bt.addRecursive(bt.root, 7);
		bt.addRecursive(bt.root, 1);
		bt.addRecursive(bt.root, 10);
		//bt.addRecursive(bt.root, 2);
		levelOrderTraversal(bt.root);

	}
	
	public static void levelOrderTraversal(Node root) {
		if(root ==null)return;
		List<Node> queue=new ArrayList();
		
		queue.add(root);
		while(!queue.isEmpty()) {
			Node current=queue.remove(0);
			System.out.println(current.value);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
		}
	}
	
	

}
