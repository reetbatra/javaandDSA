package factorial;
import java.util.*;
public class SumOfDigits {

	public static int sumofDigits(int input) {
//		int sum;
//		 if (input == 0) 
//
//		       return 0; 
//		else
//		    return (input%10+sumofDigits(input/10)); 
//		      
//			}
	int sum;
	if(input<10) {
		return input;
	}
	sum = (input % 10) + sumofDigits(input/10);
	return sum;
}

		
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(SumOfDigits.sumofDigits(n));

	}

}
