package com.sameer.tree;

public class DiameterOfTree {

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
		System.out.println(diameterOfTree(bt.root));

	}
	
	
	public static int treeHeight(Node current) {
		//return 0;
		int lHeight=0;
		int rHeight=0;
		
		if(current!=null && current.getLeft()!=null)
			lHeight=1+treeHeight(current.getLeft());
		if(current!=null && current.getRight()!=null)
			rHeight=1+treeHeight(current.getRight());
		return Integer.max(lHeight, rHeight);
		
	}
	
	public static int diameterOfTree(Node current) {
		
		int lHeight=0;
		int rHeight=0;
		int lDiameter=0;
		int rDiameter=0;
		
		if(current!=null && current.getLeft()!=null)
		 lHeight=treeHeight(current.getLeft());
		if(current!=null && current.getRight()!=null)
		 rHeight=treeHeight(current.getRight());
		if(current!=null && current.getLeft()!=null)
		 lDiameter=diameterOfTree(current.getLeft());
		 if(current!=null && current.getRight()!=null)
		 rDiameter=diameterOfTree(current.getRight());		 
		 return Integer.max((lHeight+ rHeight+1),Integer.max(lDiameter, rDiameter));
		 
		
		
	}

}
