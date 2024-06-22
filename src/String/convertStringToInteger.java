package String;

public class convertStringToInteger {
	public static void main(String[] args) {
//          System.out.println(isNumeric("123"));
          String str="123";
          if(!isNumeric(str)) {
        	  System.out.println("Given data is not numeric");
          }else {
        	  System.out.println("Numeric form is "+Integer.parseInt(str));
          }
	}
	
	public static boolean isNumeric(String str) {
		if(str==null || str.isEmpty()) {
			return false;
		}
		
		for(char ch:str.toCharArray()) {
			if(!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}
}
