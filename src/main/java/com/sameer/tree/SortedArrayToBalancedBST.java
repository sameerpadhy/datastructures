package com.sameer.tree;

public class SortedArrayToBalancedBST {
	
	public static Node createBST(Integer[] arr, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid=(start+end)/2;
		Tree tree=new Tree();
		tree.root=new Node(arr[mid]);
		tree.root.setLeft(createBST(arr, start, mid-1));
		tree.root.setRight(createBST(arr, mid+1, end));
		return tree.root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr= {1,2,3,4,5,6};
		Node node=createBST(arr, 0, arr.length-1);
		Tree t=new Tree();
		t.preOrder(node);
		System.out.println("----");
		t.InOrder(node);
		System.out.println("----");
		t.postOrder(node);
		

	}

}
