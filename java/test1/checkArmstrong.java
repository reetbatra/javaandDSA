package test1;
import java.util.Scanner;
public class checkArmstrong {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int originalNumber=n;
		int num=n;
		int length=0;
		while(num>0) {
			length++;
			num= num/10;
			
		}
		int sum=0;
		while(n>0) {
			sum+=(Math.pow(n%10, length));
			n/=10;
			
		}
		if(originalNumber== sum) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
