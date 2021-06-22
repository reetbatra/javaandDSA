package factorial;

import java.util.Scanner;

public class checkNoinArray {
	
	public static boolean checkNum(int arr[], int x) {
		if(arr.length ==1) {
			if(arr[0] == x) {
				return true;
			}
			else  {
				return false;
			}
		}
			else if(arr[arr.length - 1 ] == x) {
				return true;
			}
		int smallCheck[] = new int[arr.length-1];
		for(int i =0; i<arr.length - 1; i++) {
			smallCheck[i] = arr[i];
				
			}
			boolean output = checkNum(smallCheck, x);
			return output;
		}
	

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i =0; i<n;i++) {
			arr[i]= s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNum(arr,x));
		s.close();
	}

}
