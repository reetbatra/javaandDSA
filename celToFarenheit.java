package codingques;
import java.util.Scanner;
public class celToFarenheit {

	public static void main(String[] args) {
	
			Scanner s = new Scanner(System.in);
	     int S = s.nextInt();
	     int E = s.nextInt();
	     int W = s.nextInt();
	     while(S<= E){
	            double C = (double)5/9 *(S-32); 
	            System.out.println( S + "\t" + (int)C);
	            S += W ;
	        }   
			
		}
}