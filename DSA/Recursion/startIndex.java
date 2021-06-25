package factorial;
import java.util.*;
public class startIndex {
	Scanner s  = new Scanner(System.in);
	
	public static int firstIndex(int arr[], int x) {
		if(arr.length==0) {
			 return -1;
		}
		if(arr[0] ==x) {
			return 0;
		}
		int smallArray[]= new int[arr.length -1];//not an optimised approach creating an arr again and again
		for(int i = 1; i< arr.length; i++) {
			smallArray[i-1] = arr[i];
		}
		int fi = firstIndex(smallArray, x);
		if (fi ==-1) {
			return -1;
		}else {
			return fi +1;
		}
	}
	
	public static int firstIndexBetter(int arr[], int x, int si) {
		if(si == arr.length) {
			return -1;
		}
		if (arr[si] == x) {
			return si;
		}
		
		int k = firstIndexBetter(arr, x, si +1);
		return k;
	}
	
	public static int[] takeInput() {
		Scanner s  = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i =0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
	   int[] arr = takeInput();
       int x = s.nextInt();
       int si = s.nextInt();
       System.out.println(firstIndexBetter(arr, si, x));
	}

}
