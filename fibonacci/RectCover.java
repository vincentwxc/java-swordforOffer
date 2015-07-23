package fibonacci;

public class RectCover {
	public static int RectCover1(int target) {
		int result[] = {0,1,2};
		if(target < 3){
			return result[target];
		}
		int rect = 0;
		if(target % 2 != 0){
			int rectOne = 2;
			int rectTwo = 1;
			for(int i = 3; i<= target; i ++){
				rect = rectOne + rectTwo;
				rectTwo = rectOne;
				rectOne = rect;
			}
		}else{
			rect = 2<<(target/2 - 1);
		}
		return rect;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RectCover1(0));
		System.out.println(RectCover1(1));
		System.out.println(RectCover1(2));
		System.out.println(RectCover1(3));
		System.out.println(RectCover1(4));
		System.out.println(RectCover1(6));

	}

}
