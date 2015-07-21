package reOrderArray;

public class ReOrderArrayDemo1 {
	
	public static void reOrderArray(int [] array){
		if(array == null){
			return ;
		}		
		int indexNow = 0;
		int index = 0;
		while(index < array.length){
		while(index < array.length && !isEven(array[index])){
			if(index > indexNow){
				int temp = array[index];
				for(int indexChange = index; indexChange > indexNow; -- indexChange){
					array[indexChange] = array[indexChange - 1];
				}
			array[indexNow] = temp;
			}
			indexNow ++;
			index ++;
		}
		while(index < array.length && isEven(array[index]))
			index ++;
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
		int[] array = {1,2,4,5,3};
		reOrderArray(array);
		for(int i = 0; i < array.length; i++){
		System.out.print(array[i] + " ");

	}
	}

}
