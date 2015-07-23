package listNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListReversingly_Recursively {
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		Stack<Integer> s = new Stack<Integer>();
		while(listNode != null){
			s.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(!s.empty()){
			al.add(s.lastElement());
			s.pop();
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(printListFromTailToHead(node1));

	}

}
