package codingques;

import java.util.Scanner;

public class powerofNUM {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      int x= s.nextInt();
	      int n= s.nextInt();
	      if(n==0){
	            System.out.print(1);
	        }
	        else{
	            int ans=1;
	            while(n!=0){
	        
	                ans=ans*x;
	                n--;
	                
	            }
	            System.out.println(ans);
	        }
	    }
   

	}


