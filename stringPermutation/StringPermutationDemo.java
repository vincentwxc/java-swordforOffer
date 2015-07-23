package stringPermutation;
import java.util.ArrayList;

public class StringPermutationDemo {
	static ArrayList<String> stringList = new ArrayList<String>();
	public static ArrayList<String> Permutation(String str){
		if(str == null || str.length() == 0)
			return stringList;
		char[] charArray = str.toCharArray();
		//ArrayList<String> stringList = new ArrayList<String>();
		PermutationString(charArray, 0);
		return stringList;
	}
	public static void PermutationString(char[] charArray, int index){
		if(index == charArray.length){
			String str1 = new String(charArray);
			stringList.add(str1);
		}else{
			for(int i = index; i < charArray.length; i ++){
				if(charArray[index] == charArray[i] && i != index){
					PermutationString(charArray, i + 2);
				}else{
				char temp = charArray[index];
				charArray[index] = charArray[i];
				charArray[i] = temp;
				PermutationString(charArray, index + 1);
				temp = charArray[index];
				charArray[index] = charArray[i];
				charArray[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aa";
		//String str1 = new String();
		ArrayList<String> strList = Permutation(str);
		for(int i = 0; i < strList.size(); i ++){
			System.out.print(strList.get(i) + " ");
		}

	}

}
