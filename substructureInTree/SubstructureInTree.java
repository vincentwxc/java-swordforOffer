package substructureInTree;

public class SubstructureInTree {
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		boolean lResult = false;
		boolean rResult = false;
		if(root2 == null){
			result = true;
			return result;
		}else if(root1 == null){
			return result;
		}
		if(root1.val == root2.val){
			lResult = HasSubtree(root1.left, root2.left); 
			rResult = HasSubtree(root1.rigth, root2.rigth);
			result = lResult && rResult;
			}
		if(!result)
			result = HasSubtree(root1.left, root2);
		if(!result)
			result = HasSubtree(root1.rigth, root2);
		return result;
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1 = new TreeNode(8);
		TreeNode root2 = new TreeNode(8);
		TreeNode root11 = new TreeNode(8);
		TreeNode root111 = new TreeNode(9);
		TreeNode root112 = new TreeNode(2);
		TreeNode root1121 = new TreeNode(4);
		TreeNode root1122 = new TreeNode(7);
		TreeNode root12 = new TreeNode(7);
		TreeNode root21 = new TreeNode(9);
		TreeNode root22 = new TreeNode(2);
		root1.left = root11;
		root11.left = root111;
		root11.rigth = root112;
		root112.left = root1121;
		root112.rigth = root1122;
		root1.rigth = root12;
		root2.left = root21;
		root2.rigth = root22;
		System.out.println(HasSubtree(root1,root2));
		System.out.println(HasSubtree(root1,null));
		System.out.println(HasSubtree(null,root2));
		System.out.println(HasSubtree(null, null));
		System.out.println(HasSubtree(root111,root2));

	}

}
