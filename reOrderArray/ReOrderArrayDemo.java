package reOrderArray;

public class ReOrderArrayDemo {
	
	public static void reOrderArray(int [] array) {
    	if(array == null)
    		return ;
    	int indexBegin = 0;
    	int indexEnd = array.length - 1;
    	while(indexEnd > indexBegin){
    		while(indexEnd > indexBegin && !isEven(array[indexBegin]))
    			indexBegin ++;
    		while(indexEnd > indexBegin && isEven(array[indexEnd]))
    			indexEnd --;
    		if(indexEnd > indexBegin){
    			int temp = array[indexBegin];
    			array[indexBegin] = array[indexEnd];
    			array[indexEnd] = temp;
    		}
    	}
    }
	public static boolean isEven(int number){
		if((number & 0x1) == 0){
			return true;
		}else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5};
		reOrderArray(array);
		for(int i = 0; i < array.length; i++){
		System.out.print(array[i] + " ");
		}

	}

}
