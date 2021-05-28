import java.util.Arrays;

public class pushzeroestoend {
	
	public static void pushZeroes(int[] arr) {
		int i=0; int j=0;
		while(i< arr.length) {
			if(arr[i] !=0) {
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			i++;
		}
	}

	      public static void main(String[] args) {
          int arr[] = new int [7]; 
           int arr1[]= {1,2,0,9,0,8,0,7};
           pushZeroes(arr);
          System.out.println(Arrays.toString(arr));	
	}

}
