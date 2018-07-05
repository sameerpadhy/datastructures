package com.sameer.tree;

public class HeightOfTree {

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
		System.out.println(treeHeight(bt.root));

	}
	
	public static int treeHeight(Node current) {
		int leftHeight=0;
		int rightHeight=0;
		if(current.getLeft()!=null) {
			leftHeight=1+treeHeight(current.getLeft());
		}
		if(current.getRight()!=null) {
			rightHeight=1+treeHeight(current.getRight());
		}
		return leftHeight>rightHeight? leftHeight:rightHeight;
	}

}
