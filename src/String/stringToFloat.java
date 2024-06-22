package String;

public class stringToFloat {

	public static void main(String[] args) {
		String str="1hh";
//		if(!stringFloat(str)) {
//			System.out.println("Cant be converted");
//		}else {
//			System.out.println("converted form is "+Float.parseFloat(str));
//		}
		
		System.out.println(convert(str));
	}
	
	public static boolean stringFloat(String str) {
		if(str.isEmpty() || str==null) {
			return false;
		}
		
		for(char ch:str.toCharArray()) {
			if(!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean convert(String str) {
		try {
			float f=Float.parseFloat(str);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}
}
