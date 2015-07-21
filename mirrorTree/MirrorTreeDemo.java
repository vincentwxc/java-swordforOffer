package mirrorTree;

public class MirrorTreeDemo {
	public void Mirror(TreeNode root) {
		if(root == null)
			return;
		if(root.left == null && root.right == null)
			return;
		TreeNode nodeTemp = root.left;
		root.left = root.right;
		root.right = nodeTemp;
		if(root.left != null)
			Mirror(root.left);
		if(root.right != null)
			Mirror(root.right);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
