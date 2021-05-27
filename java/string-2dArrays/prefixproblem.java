
public class prefixproblem {
	
	
	public static void print(String s) {
		for(int i=0; i< s.length();i++){
			System.out.println(s.charAt(i));
		}
	}
	
	 public static void printPrefix(String str) {
		 for(int i=0;i<str.length(); i++) {
			 System.out.println(str.substring(0,i+1));
		 }
	 }

	public static void main(String[] args) {
		String str="abcde";
		printPrefix(str); 
 
	}

}
