package sort;

// import java.util.Arrays;
public class MinNumberInRotatedArray {
	public static int minNumberInRotateArray(int [] array) {
		if(array == null ||array.length == 0){
			return 0;
		}
	    int index1 = 0;
	    int index2 = array.length-1;
	    int indexMid = index1;
	    while(array[index1] >= array[index2]){
	    	if(index2 - index1 == 1){
	    		indexMid = index2;
	    		break;
	    	}
	    	indexMid = (index1 + index2)/2;
	    	if(array[index1] == array[index2] && array[indexMid] == array[index1])
	    		return minInOrder(array, index1, index2);
	    	if(array[index1] <= array[indexMid]){
	    		index1 = indexMid;
	    	}else if(array[index2] >= array[indexMid]){
	    		index2 = indexMid;
	    	}
	    }
	    return array[indexMid];
    }
	public static int minInOrder(int[] array, int index1, int index2){
		int result = array[index1];
		for(int i = index1+1; i <= index2; i ++){
			if(array[i] < result){
				result = array[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,4,5,1,2};
		int[] array1 = {1,1, 1, 1 ,1 ,1,1};
		int[] array2 = {};
		System.out.println(minNumberInRotateArray(array));
		System.out.println(minNumberInRotateArray(array1));
		System.out.println(minNumberInRotateArray(array2));

	}

}
