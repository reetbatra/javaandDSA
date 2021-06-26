package factorial;
import java.util.*;
public class countZeroes {
    public static int zeros(int input) {
    	if(input == 0) {
    		return 1;
    	}
    	if(input < 10) {
    		return 0;
    	}
    	int smallOutput = zeros(input/10);
    	if(input%10 ==0) {
    		return smallOutput+1;
    	}
    	else {
    		return smallOutput;
    	}
    	
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(zeros(n));
	}

}
