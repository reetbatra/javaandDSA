package factorial;
import java.util.Scanner;
public class ReplacePI {

	
	public static String replacePi(String input) {
		if(input.length() <=1) {
			return input;
		}
		if(input.charAt(0)=='p' && input.length() >=2 && input.charAt(1)=='i') {
			return "3.14" + replacePi(input.substring(2, input.length()));
		}
		
		return input.charAt(0) + replacePi(input.substring(1, input.length()));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(replacePi(input));
		s.close();

	}

}
