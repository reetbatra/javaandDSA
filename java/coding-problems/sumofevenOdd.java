package codingques;
import java.util.Scanner;
public class sumofevenOdd {
	Scanner s = new Scanner(System.in);
    int N = s.nextInt();
        //Making a variable for storing sum of all even numbers 
        int countofodd=0, countofeven=0;
        //Making a variable for storing sum of all odd numbers
      while(N>0){
          int i =N%10;
          //checking if a nnumber is odd 
          if(i%2!=0)
          {
              //Adding all odd numbers
              countofodd=countofodd+i;
          }
          else if(i%2==0)
          {
              countofeven=countofeven+i;
          }	 
          N=N/10;
      }  
        System.out.println(countofeven+" "+countofodd);

	}
}
	
