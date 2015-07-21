package number;

public class Number1 {
	
	public static int Number2(int n){
		int count = 0;
		while(n != 0){
			++ count;
			n = (n - 1) & n;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Number2(9));
		System.out.println(Number2(-9));
		System.out.println(Number2(0));
		System.out.println(Number2(-1));

	}

}
