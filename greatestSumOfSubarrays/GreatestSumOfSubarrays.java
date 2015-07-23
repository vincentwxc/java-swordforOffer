package greatestSumOfSubarrays;

public class GreatestSumOfSubarrays {
	public static int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length <= 0)
        	return 0;
        int nCursum = 0;
        int greatestSum = 0;
        for(int i = 0; i < array.length; i ++){
        	if(i == 0){
        		nCursum = array[i];
        		greatestSum = nCursum;
        	}else{
        	if(nCursum <= 0){
        		nCursum = array[i];
        	}else
        		nCursum += array[i];
        	if(nCursum >greatestSum)
        		greatestSum = nCursum;
        }
        }
        return greatestSum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,-2,3,10,-4,7,2,-5};
		int[] array2 = {-2,-8,-1,-5,-9};
		int[] array3 = {2,8,1,5,9};
		System.out.println(FindGreatestSumOfSubArray(array));
		System.out.println(FindGreatestSumOfSubArray(array2));
		System.out.println(FindGreatestSumOfSubArray(array3));
	}

}
