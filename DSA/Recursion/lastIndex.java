package factorial;
import java.util.*;
public class lastIndex {
	
	public static int lastIndex(int arr[], int x) {
		if(arr.length ==0) {
			return -1;
		}
		int smallArray[] = new int[arr.length -1];
		for(int i = 1; i< arr.length; i++) {
			smallArray[i-1] = arr[i];
		}
		int k = lastIndex(smallArray, x);
		if(k != -1) {
			return k+1;
		}
		else {
			if(arr[0] == x) {
				return 0;
			}
			else {
				return -1;
			}
		}
	}
 
	public static int lastIndexBetter(int arr[], int x, int si) {
		if(si == arr.length) {
			return -1;
		}
		int k = lastIndexBetter(arr, x, si +1);
		if(k != -1) {//if k= -1 means that x is not present in right side, check left
			return k;
		} else {
			if(arr[si] == x) {
				return si;
			}else {
				return -1;
			}
		}
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
       System.out.println(lastIndexBetter(arr, si, x));
	}

	

	}

