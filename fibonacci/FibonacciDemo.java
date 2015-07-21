package fibonacci;

public class FibonacciDemo {
	
	public static long Fibonacci(int n) {
		int[] result = {0, 1,2};
		if(n < 3){
			return result[n];
		}
		long fibOne = 2;
		long fibTwo = 1;
		long fibN = 0;
		for(int i = 3; i <= n; i ++){
			fibN = fibOne + fibTwo;
			fibTwo = fibOne;
			fibOne = fibN;
		}
		return fibN;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fibonacci(1));
		System.out.println(Fibonacci(0));
		System.out.println(Fibonacci(2));
		System.out.println(Fibonacci(4));
		System.out.println(Fibonacci(10));
		System.out.println(Fibonacci(13));

	}

}
