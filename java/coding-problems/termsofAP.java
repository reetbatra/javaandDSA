package operators;
import java.util.Scanner;
public class termsofAP {

	public static void main(String[] args) {
	     Scanner S = new Scanner(System.in);
	     int x=S.nextInt();
	     
	        int count =0;
	        int n = 1;
	        while(count<x){

	            int d=3*n+2;
	            if(d%4!=0) {
	                count++;
	                System.out.print(d+" ");
	            }
	            n++;   
	        }
	    }
	}