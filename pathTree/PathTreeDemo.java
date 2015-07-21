package pathTree;
import java.util.ArrayList;
public class PathTreeDemo {
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<Integer> path = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> finalPath = new ArrayList<ArrayList<Integer>>();
        int currentSum = 0;
        findPath(root, target, path, finalPath, currentSum);
        return finalPath;
    }
	public static void findPath(TreeNode root, int target,ArrayList<Integer> path, ArrayList<ArrayList<Integer>> finalPath, int currentSum){
		if(root == null)
        	return ;
		currentSum += root.val;
		path.add(root.val);
		boolean isLeaf = root.left == null && root.right == null;
		if(currentSum == target && isLeaf){
			finalPath.add(new ArrayList<Integer>(path));
			path.remove(path.size() - 1);
			return;
		}
		if(root.left != null)
			findPath(root.left, target, path, finalPath, currentSum);
		if(root.right != null)
			findPath(root.right, target, path, finalPath, currentSum);
		path.remove(path.size() - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode node1 = new TreeNode(5);
		TreeNode node11 = new TreeNode(4);
		TreeNode node12 = new TreeNode(7);
		TreeNode node2 = new TreeNode(12);
		root.left = node1;
		root.right = node2;
		node1.left = node11;
		node1.right = node12;
		ArrayList<ArrayList<Integer>> path1 = FindPath(root, 22);
		for(int i = 0 ; i < path1.size(); i ++){
			for(int j = 0; j < path1.get(i).size(); j ++){
				System.out.print(path1.get(i).get(j) + " ");
			}
			System.out.println("");
		}

	}

}
