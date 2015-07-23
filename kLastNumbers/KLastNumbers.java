package kLastNumbers;
import java.util.ArrayList;
public class KLastNumbers {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> leastNumbers = new ArrayList<Integer>();
        if(k < 1 || input.length < k || input == null)
        	return null;
        for(int i = 0; i < input.length; i ++){
        	if(leastNumbers.size() < k){
        		leastNumbers.add(input[i]);
        	}else{
        		int rootIndex = k/2 - 1;
        		while(rootIndex >= 0){
        			reheap(leastNumbers, rootIndex, k - 1);
        			rootIndex --;
        		}
        		if(input[i] < leastNumbers.get(0)){
        			leastNumbers.set(0, input[i]);
        			reheap(leastNumbers, 0, k - 1);
        		}
        	} 
        }
        return leastNumbers;
    }
	public static void reheap(ArrayList<Integer> leastNumbers, int rootIndex, int lastIndex){
		int temp = leastNumbers.get(rootIndex);
		boolean flag = false;
		int leftIndex = rootIndex*2 + 1;
		while(!flag && leftIndex <= lastIndex){
			int lagerIndex = leftIndex;
			if(leftIndex + 1 <= lastIndex){
				int rightIndex = leftIndex + 1;
				if(leastNumbers.get(rightIndex) > leastNumbers.get(leftIndex))
				lagerIndex = rightIndex;
			}
				if(temp < leastNumbers.get(lagerIndex)){
					leastNumbers.set(rootIndex, leastNumbers.get(lagerIndex));
					rootIndex = leftIndex;
					leftIndex = rootIndex*2 + 1;
				}else{
					flag = true;
				}
			}
			leastNumbers.set(rootIndex, temp);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,5,1,6,2,7,3,8};
		int k = 10;
		ArrayList<Integer> output = GetLeastNumbers_Solution(input, k);
		for(int i = 0; i < output.size(); i ++){
			System.out.print(output.get(i) + " ");
		}

	}

}
