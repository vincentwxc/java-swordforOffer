package string;

public class ReplaceBlank {
	
	public static String replaceSpace(StringBuffer str){
		int numOfSpace = 0;
		for(int i = 0; i < str.length(); i++){
			char tempStr = str.charAt(i);
			if(tempStr == ' ')
				numOfSpace ++;
		}
		if(numOfSpace == 0){
			return str.toString();
			}
		int newLength = str.length() +2*numOfSpace;
		int indexOfOriginal = str.length() - 1;
		int indexOfNew = newLength - 1;
		char[] newStr = new char[newLength];
		System.arraycopy(str.toString().toCharArray(), 0, newStr, 0, str.length());
		while(indexOfOriginal >= 0 && indexOfNew > indexOfOriginal){
			if(str.charAt(indexOfOriginal) == ' '){
				newStr[indexOfNew --] = '0';
				newStr[indexOfNew --] = '2';
				newStr[indexOfNew --] = '%';
			}else{
				newStr[indexOfNew --] = str.charAt(indexOfOriginal);
			}
			--indexOfOriginal;
		}
		return String.valueOf(newStr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(replaceSpace(new StringBuffer("we are happy")));
		//System.out.println(replaceSpace(new StringBuffer(" ")));
		System.out.println(replaceSpace(new StringBuffer()));

	}

}
