package factorial;
import java.util.*;
public class GeometricSum {
    public static double GeometricSum(int k) {
    	if(k==0) {
    		return 1;
    	}
    	return GeometricSum(k-1)+1/Math.pow(2, k);
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k =s.nextInt();
		double ans = GeometricSum(k);
        System.out.println(ans);
	}

}
