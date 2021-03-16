package codingques;
import java.util.Scanner;
public class reverseNoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        while(i<=n){
			int j=i;
			while(j>0){
			
			System.out.print(j);
	          
	          j--;
	      }
	  System.out.println("");
	     i++;
		}

		}
	}

