import java.util.Scanner;
public class rowWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("enter rows:");
        int rows= s.nextInt();
        System.out.println("enter cols:");
        int cols = s.nextInt();
        int input[][] = new int[rows][cols];
        for(int i=0; i<rows; i++) {
        	int sum=0;
        	for(int j=0; j<cols; j++) {
        		System.out.println("enter element at "+i+" row "+j+" column");
        				input[i][j] = s.nextInt();
        				sum=sum+input[i][j];
        	}
        }
        for(int i=0; i<rows; i++) {
          int sum=0;
        	for(int j=0; j<cols;j++) {
        		System.out.print(input[i][j] + " ");
        		sum=sum+input[i][j];
        	}
        	System.out.println("sum=" +sum);
        	 System.out.println(); //should be inside for i loop
        	 //System.out.println("sum=" +sum);
        }

	}
}
