import java.util.Scanner;

public class patternD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i =1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}



	}


