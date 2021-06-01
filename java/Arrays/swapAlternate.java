import java.util.Scanner;
public class swapAlternate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements of array:");
		for(int a=0; a<n;a++) {
			
			arr[a]=s.nextInt();
		}
		if(n%2==0) {
		int i;
		for(i=0; i<n; i+=2) {
			int temp = arr[i];
			arr[i]= arr[i+1];
			arr[i+1]=temp;
			//i++;
		}
	}
		else {
		
			for( int j=0; j<n; j+=2) {
				int temp = arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=temp;
				//j++;
			
		}

}
		for(int k=0; k<n;k++) {
			System.out.print(arr[k]);
		}
	}
}
