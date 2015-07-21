package convertBinarySearchTree;
import java.util.ArrayList;
public class ConvetBinarySearchTreeDemo {
	// private static TreeNode pLastNodeInList;
	public static TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree.val == 0){
        	return null;
        }else{
        ArrayList<TreeNode> pLastNodeInList = new ArrayList<TreeNode>();
        ConvertNode(pRootOfTree, pLastNodeInList);
        TreeNode pHeadOfList = pLastNodeInList.get(0);
        //while(pHeadOfList != null && pHeadOfList.left != null){
        //	pHeadOfList = pHeadOfList.left;
        //}
        return pHeadOfList;
        }
    }
	public static void ConvertNode(TreeNode pRootOfTree,ArrayList<TreeNode> pLastNodeInList){
		if(pRootOfTree == null)
			return;
		TreeNode pCurrent = pRootOfTree;
		if(pCurrent.left != null)
			ConvertNode(pCurrent.left, pLastNodeInList);
		if(pLastNodeInList.size() == 0){
			pCurrent.left = null;}
		else{
			pCurrent.left = pLastNodeInList.get(pLastNodeInList.size()-1);
		}
		if(pLastNodeInList.size() != 0)
			pLastNodeInList.get(pLastNodeInList.size() - 1).right = pCurrent;
		pLastNodeInList.add(pCurrent);
		if(pCurrent.right != null)
			ConvertNode(pCurrent.right, pLastNodeInList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode node1 = new TreeNode(6);
		TreeNode node11 = new TreeNode(4);
		TreeNode node12 = new TreeNode(8);
		TreeNode node2 = new TreeNode(14);
		TreeNode node21 = new TreeNode(12);
		TreeNode node22 = new TreeNode(16);
		root.left = node1;
		node1.left = node11;
		node1.right = node12;
		root.right = node2;
		node2.left = node21;
		node2.right = node22;
		TreeNode pHead = Convert(root);
		while(pHead != null){
			System.out.print(pHead.val + " ");
			pHead = pHead.right;
		}
		TreeNode pHead1 = Convert(new TreeNode());
		while(pHead1 != null){
			System.out.print(pHead1.val + " ");
			pHead1 = pHead1.right;
		}

	}

}
