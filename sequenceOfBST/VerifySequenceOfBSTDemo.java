package sequenceOfBST;

import java.util.Arrays;
public class VerifySequenceOfBSTDemo {
	public static boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0){
        	return false;
        }
        int root = sequence[sequence.length - 1];
        
        int i = 0;
        for(; i < sequence.length - 1; i ++){
        	if(sequence[i] > root)
        		break;
        }
        int j = i;
        for(; j < sequence.length - 1; j ++){
        	if(sequence[j] < root)
        		return false;
        }
        boolean bLeft = true;
        if(i > 0)
        	bLeft =  VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        boolean bRight = true;
        if(j < sequence.length - 1)
        	bRight = VerifySquenceOfBST(Arrays.copyOfRange(sequence, j, sequence.length - 1));
        return bLeft & bRight;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sequence = {5,7,6,9,11,10,8};
		int[] sequence1 = {7,4,5,6};
		int[] sequence2 = {};
		System.out.println(VerifySquenceOfBST(sequence));
		System.out.println(VerifySquenceOfBST(sequence1));
		System.out.println(VerifySquenceOfBST(sequence2));

	}

}
