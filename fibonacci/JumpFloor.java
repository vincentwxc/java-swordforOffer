package fibonacci;

public class JumpFloor {
	public static int JumpFloorII(int target) {
		int result[] = {0,1};
		if(target < 2){
			return result[target];
		}
		return 2<<(target-2);
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(JumpFloorII(0));
		System.out.println(JumpFloorII(1));
		System.out.println(JumpFloorII(2));
		System.out.println(JumpFloorII(3));
		System.out.println(JumpFloorII(4));
		System.out.println(2<<0);
		System.out.println(2<<-1);
	}

}
