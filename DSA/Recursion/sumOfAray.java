package factorial;
import java.util.*;
public class sumOfAray {

	public static int arraysum(int arr[]) {
		if(arr.length == 1) {
		return arr[0];
		}
		int[] smallOutput = new int[arr.length -1];
		
		for(int i=0; i<arr.length - 1; i++) {
			smallOutput[i] = arr[i];
		}
		int output = arr[arr.length - 1] + arraysum(smallOutput);
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n;i++) {
			arr[i]= s.nextInt();
		}
		System.out.println(arraysum(arr));
		s.close();

	}

}
