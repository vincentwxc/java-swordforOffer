package moreThanHalfNumber;

public class MoreThanHalfNumber {
	static boolean isInvalid = false;
	public static boolean CheckInvalidArray(int [] array){
		isInvalid = false;
		if(array == null || array.length <= 0){
			isInvalid = true;
		}
		return isInvalid;
	}
	public static boolean CheckMoreThanHalf(int [] array, int number){
		int time = 0;
		for(int i = 0; i < array.length; i ++){
			if(number == array[i])
				time ++;
		}
		boolean isMoreThanHalf = true;
		if(time*2 <= array.length){
			isInvalid = true;
			isMoreThanHalf = false;
		}
		return isMoreThanHalf;
	} 
	public static int MoreThanHalfNum_Solution(int [] array) {
        if(CheckInvalidArray(array) == true){
        	return 0;
        }
        int result = array[0];
        int times = 1;
        for(int i = 0; i < array.length; i ++){
        	if(times == 0){
        		result = array[i];
        		times = 1;
        	}else if(result == array[i]){
        		times ++;
        	}else
        		times --;
        }
        if(!CheckMoreThanHalf(array, result))
        	result = 0;
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,2,2,2,5,4,2};
		int result = MoreThanHalfNum_Solution(array);
		System.out.println(result);

	}

}
