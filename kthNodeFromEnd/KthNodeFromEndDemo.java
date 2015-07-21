package kthNodeFromEnd;

public class KthNodeFromEndDemo {
	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k == 0){
			return null;
		}
		ListNode pAhead = head;
		ListNode pBehind = null;
		for(int i = 0; i < k - 1; i ++){
			if(pAhead.next != null){
				pAhead = pAhead.next;
			}else{
				return null;
			}
		}
		pBehind = head;
		while(pAhead.next != null){
			pAhead = pAhead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = null;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		System.out.println(FindKthToTail(node1,3).val);
		System.out.println(FindKthToTail(node1,6).val);
		System.out.println(FindKthToTail(node1,0).val);
		System.out.println(FindKthToTail(node6,3).val);
	}

}
