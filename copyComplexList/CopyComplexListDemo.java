package copyComplexList;

public class CopyComplexListDemo {
	public static RandomListNode Clone(RandomListNode pHead)
    {
        CloneNodes(pHead);
        ConnectRandomNodes(pHead);
        return ReconnectNode(pHead);
    }
	public static void CloneNodes(RandomListNode pHead){
		RandomListNode pNode = pHead;
		while(pNode != null){
			RandomListNode pCloneNode = new RandomListNode(0);
			pCloneNode.label = pNode.label;
			pCloneNode.next = pNode.next;
			pCloneNode.random = null;
			pNode.next = pCloneNode;
			pNode = pCloneNode.next;
		}
	}
	public static void ConnectRandomNodes(RandomListNode pHead){
		RandomListNode pNode = pHead;
		while(pNode != null){
			RandomListNode pCloneNode = pNode.next;
			if(pNode.random != null){
				pCloneNode.random = pNode.random.next;
			}
			pNode = pCloneNode.next;
		}
	}
	public static RandomListNode ReconnectNode(RandomListNode pHead){
		RandomListNode pNode = pHead;
		RandomListNode pCloneHead = null;
		RandomListNode pCloneNode = null;
		if(pNode != null){
			pCloneHead = pCloneNode = pHead.next;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
		}
		while(pNode != null){
			pCloneNode.next = pNode.next;
			pCloneNode = pCloneNode.next;
			pNode.next = pCloneNode.next;
			pNode = pNode.next;
		}
		return pCloneHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode pHead = new RandomListNode(1);
		RandomListNode pNode1 = new RandomListNode(2);
		RandomListNode pNode2 = new RandomListNode(3);
		RandomListNode pNode3 = new RandomListNode(4);
		RandomListNode pNode4 = new RandomListNode(5);
		pHead.next = pNode1;
		pHead.random = pNode2;
		pNode1.next = pNode2;
		pNode1.random = pNode3;
		pNode2.next = pNode3;
		pNode3.next = pNode4;
		pNode3.random = pNode1;
		Clone(pHead);
		RandomListNode pNode = pHead;
		while(pNode != null){
			System.out.print(pNode.label + " ");
			pNode = pNode.next;
		}
		System.out.println();
		RandomListNode pNodes = pHead;
		while(pNodes != null){
			if(pNodes.random != null){
				System.out.print(pNodes.random.label + " ");
			}else{
				System.out.print("  ");
			}
			pNodes = pNodes.next;
		}
	}

}
