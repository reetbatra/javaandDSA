package codingques;
import java.util.Scanner;
public class numPattern1 {

	public static void main(String[] args) {
		
		          Scanner s= new Scanner(System.in);
		          int n=s.nextInt();
		          int i=1;
		          int val=1;
		          while(i<=n){
		              
		             int j=1;
		             while(j<=i){
		             System.out.print(val);
		              j++;
		                  val++;
		             }

		              //move to next line
		              System.out.println();
		              i++;
		            val = i;
		          }
		        

		}
				
			
		


	}


