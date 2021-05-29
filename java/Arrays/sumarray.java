import java.util.Scanner;
public class sumarray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size of the array:");

		int n = s.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the elements");
		
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
			//int sum=0;
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
