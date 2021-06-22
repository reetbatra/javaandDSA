package factorial;
import java.util.Scanner;
public class CalculatePower {
	
	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput = power(x, n-1);
		
		int output = x*smallOutput;
		return output;
	}

	public static void main(String[] args) {
          		 Scanner s = new Scanner(System.in);
          		 int x = s.nextInt();
          		 int n = s.nextInt();
          		 System.out.println(power(x,n));
 
	}

}
