package binaryTree;

import java.util.Arrays;

public class ConstructTree {
	
	/*
	 * pre 前序遍历数组
	 * in  中序遍历数组
	 * preStart inStart 前后序左端
	 * preEnd   inEnd   前后序右端
	 * root 根节点
	 * rootvalue 根节点值
	 * */
	public static TreeNode reConstructBinaryTree(int[] pre, int[] in){
		if(pre == null || in == null || pre.length != in.length || pre.length <= 0)
			return null;
		int rootValue = pre[0];
		TreeNode root = new TreeNode(rootValue);
		if(pre[0] == pre[pre.length - 1]){
			if(in[0] == in[in.length -1] && pre[0] == in[0]){
				return root;
				}else{
					try{
						throw new Exception("Invalid input.");
					}catch(Exception e){}
				}
		}
		int rootIn = 0;
		while(rootIn < in.length && in[rootIn] != rootValue){
			++ rootIn;
			}
		if(rootIn == in.length - 1 && in[rootIn] != rootValue){
			try{
				throw new Exception("Invalid input.");
			}catch(Exception e){}
		}
		int[] leftPre  = Arrays.copyOfRange(pre, 1, rootIn+1);
		int[] rightPre = Arrays.copyOfRange(pre, rootIn+1, pre.length);
		int[] leftIn   = Arrays.copyOfRange(in, 0, rootIn);
		int[] rightIn  = Arrays.copyOfRange(in, rootIn + 1, in.length);
		if(rootIn > 0){
			root.left = reConstructBinaryTree(leftPre, leftIn);
		}
		if(rootIn <pre.length){
			root.rigth = reConstructBinaryTree(rightPre, rightIn);
		}
		return root;
	}
	
	public static void postOrder(TreeNode root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.rigth);
			dispaly(root);
		}
	}
	public static void dispaly(TreeNode root){
		System.out.print(root.val + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in  = {4,7,2,1,5,3,8,6};
		postOrder(reConstructBinaryTree(pre, in));
		

	}

}
