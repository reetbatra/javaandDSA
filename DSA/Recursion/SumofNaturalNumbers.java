package factorial;

public class SumofNaturalNumbers {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1) +n; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100 ;
		System.out.println(sum(n));

	}

}
