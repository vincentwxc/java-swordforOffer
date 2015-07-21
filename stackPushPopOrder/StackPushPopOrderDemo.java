package stackPushPopOrder;
import java.util.Stack;

public class StackPushPopOrderDemo {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
	      boolean isPossible = false;
	      if(pushA != null && popA != null && pushA.length > 0){
	    	  int indexPush = 0;
	    	  int indexPop = 0;
	    	  Stack<Integer> stackData = new Stack<Integer>();
	    	  while(indexPop < popA.length){
	    		  while(stackData.empty() || stackData.peek() != popA[indexPop]){
	    			  if(indexPush == pushA.length)
	    				  break;
	    			  stackData.push(pushA[indexPush]);
	    			  indexPush ++;
	    		  }
	    		  if(stackData.peek() != popA[indexPop])
	    			  break;
	    		  stackData.pop();
	    		  indexPop ++;
	    	  }
	    	  if(stackData.empty() && indexPop == popA.length)
	    		  isPossible = true;
	      }
	      return isPossible;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pushA = {1,2,3,4,5};
		int[] pushB = {};
		int[] popC = {};
		int[] popA = {4,5,3,2,1};
		int[] popB = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA, popA));
		System.out.println(IsPopOrder(null, popA));
		System.out.println(IsPopOrder(pushA, popB));
		System.out.println(IsPopOrder(pushB, popC));

	}

}
