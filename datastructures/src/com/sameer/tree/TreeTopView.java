package com.sameer.tree;

public class TreeTopView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree bt=new Tree();
		Node node=new Node(5);
		bt.root=node;
		bt.root.value=5;
		bt.addRecursive(bt.root, 3);
		bt.addRecursive(bt.root, 7);
		bt.addRecursive(bt.root, 9);
		bt.addRecursive(bt.root, 11);

	}
	
	//public void topView()

}
