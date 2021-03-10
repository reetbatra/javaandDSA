package codingques;

import java.util.Scanner;
public class numPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int currRow = 1;
        
        while(currRow <= n) {
 			int currCol = 1;
 			int spaces = 1;

 			while(spaces <= n - currRow) {
 				System.out.print(" ");
 				spaces += 1;
 			}
            int i=currRow;
            while(currCol <= currRow) {
                System.out.print(i);
                currCol += 1;
                i++;
            }

            System.out.println();
            currRow += 1;
        }  
    }



			
		}

