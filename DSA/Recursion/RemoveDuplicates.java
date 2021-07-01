package factorial;
import java.util.Scanner;
public class RemoveDuplicates {

	
	public static String removeDuplicates(String input) {
		if(input.length() <= 1) {
			return input;
		}
		String smallOutput = removeDuplicates(input.substring(1));
		if(input.charAt(0) == input.charAt(1)) {
			return smallOutput;
		}else {
			return input.charAt(0) + smallOutput;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        System.out.println(removeDuplicates(n));
        s.close();
	}

}
