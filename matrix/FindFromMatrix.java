package matrix;

public class FindFromMatrix {
	
	private static int[][] matrix = new int[][]{{1, 2, 8, 9}, {2, 4 ,9, 12}, 
		{4, 7, 10, 13}, {6, 8, 11, 15}};
	public static boolean find(int[][] matrix, int target){
		boolean find = false;
		int row = 0;
		int colum = matrix[0].length-1;
		while(row < matrix.length && colum >= 0){
			if(matrix[row][colum] == target){
				find = true;
				break;
			}else if(matrix[row][colum] >= target){
				--colum;
			}else{
				++row;
			}
		}
		return find;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(matrix,16));
		

	}

}
