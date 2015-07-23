package numberOf1;

public class NumberOf1 {
	public static int NumberOf1Between1AndN_Solution(int n) {
	    if(n <= 0)
	    	return 0;
	    String str = String.valueOf(n);
	    return NumberOfOne(str);
    }
	public static int NumberOfOne(String str){
		if(str == null || str.length() == 0 || str.charAt(0) < '0' || str.charAt(0) > '9'){
			return 0;
		}
		int first = str.charAt(0) - '0';
		int length = str.length();
		if(first == 0 && length == 1)
			return 0;
		if(first > 0 && length == 1)
			return 1;
		int numFirst = 0;
		if(first > 1)
			numFirst = PowerBase10(length - 1);
		if(first == 1)
			numFirst = Integer.parseInt(str.substring(1)) + 1;
		
		int numNext = first*PowerBase10(length - 2)*(length - 1);
		int numRecursive = NumberOfOne(str.substring(1));
		return numFirst + numNext + numRecursive;
	}
	public static int PowerBase10(int length){
		int result = 1;
		for(int i = 0; i < length; i ++){
			result *= 10; 
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(NumberOf1Between1AndN_Solution(10));

	}

}
