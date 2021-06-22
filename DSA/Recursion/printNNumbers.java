package factorial;
import java.util.*;
public class printNNumbers {
	
	public static int nnumbers(int n) {
		if(n==1) {
			return 1;
		}
		int small = n-1;
		System.out.println(small + n);
		return 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1; i<=n;i++) {
			System.out.println(i + " ");
		}

	}

}
