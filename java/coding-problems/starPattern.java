package codingques;
import java.util.Scanner;
public class starPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        
        int i=1;
        while(i<= n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces=spaces+1;
                
            }
            int stars=1;
            while(stars<=i){
                System.out.print("*");
                stars=stars+1;
            }
            int dec_stars=i-1;
            while(dec_stars >=1)
            {
                System.out.print("*");
               dec_stars=dec_stars -1; 
            }
            System.out.println();
            i=i+1;
        }

		
	}

}
