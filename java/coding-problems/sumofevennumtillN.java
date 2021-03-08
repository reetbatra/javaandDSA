package codingques;
import java.util.Scanner;
public class sumofevennumtillN {
	   Scanner s = new Scanner(System.in);
			int n = s.nextInt();
	        int i=0;
	        int sum=0;
	        while(i<=n){
	            if(i%2==0){
	              sum=sum+i;
	            }
	              i=i+1;
	            
	        
	        // System.out.println(sum);
	        }
	     System.out.println(sum);
		}

	}
