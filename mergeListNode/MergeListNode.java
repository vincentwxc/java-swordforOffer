package mergeListNode;

public class MergeListNode {

	public static ListNode Merge(ListNode list1,ListNode list2) {
		if(list1 == null){
			return list2;
		}else if(list2 == null){
			return list1;
		}
		ListNode mergehead = null;
		if(list1.val < list2.val){
			mergehead = list1;
			mergehead.next = Merge(list1.next, list2);
		}else{
			mergehead = list2;
			mergehead.next = Merge(list1, list2.next);
		}
		return mergehead;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list11 = new ListNode(1);
		ListNode list12 = new ListNode(3);
		ListNode list13 = new ListNode(5);
		ListNode list14 = new ListNode(7);
		list11.next = list12;
		list12.next = list13;
		list13.next = list14;
		ListNode list21 = new ListNode(2);
		ListNode list22 = new ListNode(4);
		ListNode list23 = new ListNode(6);
		ListNode list24 = new ListNode(8);
		list21.next = list22;
		list22.next = list23;
		list23.next = list24;
		ListNode list = Merge(list11, list21);
		System.out.println(list.val);
	}

}
