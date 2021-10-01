package com.sameer.list;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll1=new LinkedList();
		ll1.addFirst(new Node(9));
		ll1.addFirst(new Node(7));
		ll1.addFirst(new Node(6));
		ll1.addFirst(new Node(5));
		ll1.addFirst(new Node(2));
		

		LinkedList ll2=new LinkedList();
		ll2.addFirst(new Node(8));
		ll2.addFirst(new Node(4));
		ll2.addFirst(new Node(3));
		
		LinkedList temp=new LinkedList();
		//while(ll1.le)
		
	}
	
	public static LinkedList merge(LinkedList ll1, LinkedList ll2, LinkedList merged) {
		if(ll1==null)
			return ll2;
		if(ll2==null)
			return ll1;
		
		if(ll1.head.value<ll2.head.value) {
			merged=ll1;
			ll1.head=ll1.head.next;
		}else {
			merged=ll2;
			ll2.head=ll2.head.next;
		}
		
		
		
		
		
		return merged;
	}

}
