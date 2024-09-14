package String;

public class ParanthesisBalanced {

	public static void main(String[] args) {
		String str = "((()))()(" ;
		boolean check=isBalanced(str);
		System.out.println(check);
	}
	
	public static boolean isBalanced(String str) {
		int count=0;
		boolean toCheck=false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				count++;
			}else {
				count--;
			}
			
			if(count <0 || count>0) {
				toCheck=false;
			}else {
				toCheck=true;	
			}
		}
		return toCheck;
		}
		
	}
		


