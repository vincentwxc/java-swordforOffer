package printFromTopToBottom;
import java.util.ArrayList;
public class PrintTreeNode {
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
		ArrayList<Integer> queueB = new ArrayList<Integer>();
		if(root == null)
        	return queueB;
        queue.add(root);
        int index = 0;
        while(index < queue.size()){
        	TreeNode pNode = queue.get(index);
        	if(pNode.left != null)
        		queue.add(pNode.left);
        	if(pNode.right != null)
        		queue.add(pNode.right);
        	index ++;
        }
        for(int i = 0; i < queue.size(); i++){
        	queueB.add(queue.get(i).val);
        }
        return queueB;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(8);
		TreeNode node11 = new TreeNode(6);
		//TreeNode node12 = new TreeNode(10);
		TreeNode node111 = new TreeNode(5);
		//TreeNode node112 = new TreeNode(7);
		//TreeNode node121 = new TreeNode(9);
		//TreeNode node122 = new TreeNode(11);
		node1.left = node11;
		//node1.right = node12;
		node11.left = node111;
		//node11.right = node112;
		//node12.left = node121;
		//node12.right = node122;
		ArrayList<Integer> queue = PrintFromTopToBottom(node1);
		for(int i = 0; i < queue.size(); i ++){
			System.out.print(queue.get(i) + " ");
		}
	}

}
