package factorial;
import java.util.Scanner;
public class RemoveX_2 {

	public static String removex(String input) {
		if(input.length()==0) {
			return "";
		}
		String smallOutput = removex(input.substring(1));
		if(input.charAt(0)=='x') {
			return ""+smallOutput;
		}else {
			return input.charAt(0)+ smallOutput;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(RemoveX_2.removex(input));
	}

}
