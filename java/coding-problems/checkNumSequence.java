package scopeOfVariables;
import java.util.Scanner;
public class checkNumSequence {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
         int prev=s.nextInt();
        int count =1;
        boolean isdec=true;
        
        while(count<=n-1){
            
            int curr=s.nextInt();
            
             if(prev==curr){
                System.out.print("false"); 
                return ;
            }
            
            else if(curr>prev){
                if(isdec){
                  
                    isdec=false;
                }
            }
             else if(curr<prev){
                if(!isdec){
                    System.out.println("false");
                    return;
                }
                 
            }
            count++;
            prev=curr;
            
        }
         System.out.println("true");

	}
}	
	
