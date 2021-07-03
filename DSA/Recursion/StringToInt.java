package factorial;
import java.util.Scanner;
public class StringToInt {

	
	public static int ConvertStringToInt(String input) {
		if(input.length()==1) {
			return input.charAt(0) - '0';
		}
		int smallOutput = ConvertStringToInt(input.substring(0, input.length()-1));
		int lastDigit = input.charAt(input.length()-1)-'0';
		return smallOutput*10 + lastDigit;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(ConvertStringToInt(input));
        s.close();
	}

}
