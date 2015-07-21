package minInStack;
import java.util.Stack;

public class MinInStackDemo {
	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> sMin = new Stack<Integer>();
	public void push(int node) {
        s.push(node);
        if(sMin.size() == 0 || node < sMin.peek()){
        	sMin.push(node);
        }else{
        	sMin.push(sMin.peek());
        }
    }
    
    public void pop() {
    	assert(s.size() > 0 && sMin.size() > 0);
    	s.pop();
        sMin.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
    	assert(s.size() > 0 && sMin.size() > 0);
    	return sMin.peek();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
