package scopeOfVariables;
import java.util.Scanner;
public class binaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans=0;
		int placeValue=1;
		int remainder = 0;
		
		while(n!=0) {
			remainder = n%2;
			ans=ans+ placeValue*remainder;
            placeValue*=2;
            n=n/10;
         }
		
		 
		System.out.println(ans);
		
		
	}

}
