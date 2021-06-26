package factorial;

import java.util.Scanner;

public class Multiplication_recursive {
         public static int Multiply(int m, int n) {
        	 if(n==0 || m==0) {
        		 return 0;
        	 }
        	 return m + Multiply(m, n-1);
        	 
         }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(Multiply(m,n));
        s.close();
	}

}
