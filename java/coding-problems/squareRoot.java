package scopeOfVariables;
import java.util.Scanner;
public class squareRoot {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int n =s.nextInt();
	   int i=1;
	   while(i*i<=n) {
		   
			   i=i+1;
	   }
		   
		  i=i-1;
		  
	   System.out.println(i);

	}

}
