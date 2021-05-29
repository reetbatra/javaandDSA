import java.util.Scanner;
public class arrayavg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double avg=0;
		double sum=0;
		System.out.println("enter the size of the array:");
		int n = s.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the elements:");
		for(int i=0; i<n; i++) {
			arr[i]= s.nextInt();
			sum=sum+arr[i];
			avg=sum/n;
		}
		System.out.println(avg);

	}

}
