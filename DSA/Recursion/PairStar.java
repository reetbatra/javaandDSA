/*
 Given a string S, compute recursively a new string 
 where identical chars that are adjacent in the 
 original string are separated from each other by a "*".
 
 Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a
 */


package factorial;
import java.util.Scanner;
public class PairStar {

	public static String addStars(String input) {
		if(input.length() <=1) {
			return input;
		}
		String out = addStars(input.substring(1));
		if(input.charAt(0)==input.charAt(1)) {
			out= input.charAt(0) + "*" + input.charAt(1) + out.substring(1);
		}
		else {
			out = input.charAt(0) + out;
		}
		return out;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(PairStar.addStars(input));
	}

}
