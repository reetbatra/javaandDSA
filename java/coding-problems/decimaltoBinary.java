package scopeOfVariables;
import java.util.Scanner;
public class decimaltoBinary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int number = s.nextInt();
		if(number<0) {
			System.out.println("not a positive number");
			
		}else {
			printBinaryform(number);
			
		}
	}
		public static void printBinaryform(int number) {
			int remainder;
		if(number<=1) {
			System.out.print(number);
			return ; //kick out of the recursion
		}
		
		}
	}
	
