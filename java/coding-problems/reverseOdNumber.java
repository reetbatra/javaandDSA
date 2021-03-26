package operators;
import java.util.Scanner;
public class reverseOdNumber {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int rev=0;
		while(n>0) {
			int a=n%10;
			rev=(rev*10)+a;
			n=n/10;
		}
             System.out.println(rev);
	}

}
