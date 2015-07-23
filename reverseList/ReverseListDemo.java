package reverseList;

public class ReverseListDemo {
	
	/*
	public static ListNode ReverseList(ListNode head){
		ListNode nodeReverseHead = null;
		ListNode node = head;
		ListNode nodePrev = null;
		while(node != null){
			ListNode nodeNext = node.next;
			if(nodeNext == null){
				nodeReverseHead = node;
			}else{
			node.next = nodePrev;
			nodePrev = node;
			node = nodeNext;}
		}
		return nodeReverseHead;
	}
	*/
	public static ListNode ReverseList(ListNode head){
		if(null == head || null == head.next){
			return head;
		}
		ListNode reverseNode = ReverseList(head.next);
		head.next.next = head;
		head.next = null;
		return reverseNode;
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
		ReverseList(node1);

	}

}
