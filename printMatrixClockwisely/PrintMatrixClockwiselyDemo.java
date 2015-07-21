package printMatrixClockwisely;
import java.util.ArrayList;

public class PrintMatrixClockwiselyDemo {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
	    ArrayList<Integer> newMatrix = new ArrayList<Integer>();
		if(matrix == null)
			return null;
	    int start = 0;
	    while(matrix.length > start * 2 && matrix[0].length > start * 2){
	    	int endX = matrix[0].length - 1 - start;
			int endY = matrix.length - 1 -start;
			for(int i = start; i <= endX; i++){
				newMatrix.add(matrix[start][i]);
			}
			if(endY > start){
				for(int i = start + 1; i <= endY; i++){
					newMatrix.add(matrix[i][endX]);
				}
			}
			if(endY > start && endX > start){
				for(int i = endX -1; i >= start; i--){
					newMatrix.add(matrix[endY][i]);
				}
			}
			if(endY > start + 1 && endX > start){
				for(int i = endY - 1; i > start; i --){
					newMatrix.add(matrix[i][start]);
				}
			}
	    	start ++;
	    	}
	    return newMatrix;
    }
/*	public static ArrayList<Integer> PrintMatrixInCircle(int [][] matrix, int start){
		int endX = matrix[0].length - 1 - start;
		int endY = matrix.length - 1 -start;
		ArrayList<Integer> newMatrix = new ArrayList<Integer>();
		for(int i = start; i <= endX; i++){
			newMatrix.add(matrix[start][i]);
		}
		if(endY > start){
			for(int i = start + 1; i <= endY; i++){
				newMatrix.add(matrix[i][endX]);
			}
		}
		if(endY > start && endX > start){
			for(int i = endX -1; i >= start; i--){
				newMatrix.add(matrix[endY][i]);
			}
		}
		if(endY > start + 1 && endX > start){
			for(int i = endY - 1; i > start; i --){
				newMatrix.add(matrix[i][start]);
			}
		}
		return newMatrix;
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		ArrayList<Integer> newMatrix = printMatrix(matrix);
		for(int i = 0; i < newMatrix.size(); i++){
			System.out.print(newMatrix.get(i) + ",");
		}
		

	}

}
