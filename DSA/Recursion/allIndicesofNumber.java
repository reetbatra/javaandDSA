package factorial;
import java.util.*;
public class allIndicesofNumber {

	public static int[] allIndexes(int arr[], int x, int si) {
		if(si == arr.length) {
			int ans[] = new int[0];
		}
		int ans[] = allIndexes(arr, x, si +1);
		
		int temp = arr[si];
		if(temp==x) {
			int[] arr1 = new int[ans.length +1];
			arr1[0] = si;
			for(int i=0; i<ans.length; i++) {
				arr1[i+1]= ans[i];
			}
			return arr1;
		}
		else {
			return ans;
		}
	}
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input,x,0);
	}
	
	public static int[] takeInput() {
		int size = s.nextInt();
		int[] arr = new int[size];
		for(int i=0; i< size; i++) {
			arr1[i] = s.nextInt();
		}
		return input;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		

	}

}
