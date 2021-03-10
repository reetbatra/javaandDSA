package codingques;
import java.util.Scanner;
public class totalsalary {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
	        int basic_salary = s.nextInt();
	        String str = s.next();
	        char grade = str.charAt(0);
	        int allow=0;
	        if(grade=='A'){
	            allow=1700;
	            } else if(grade=='B'){
	            allow=1500;
	        }else if(grade=='C'){
	            allow=1300;
	        }
	        
	        double pf=(int)0.11*basic_salary;
	        double hra=(int)0.20*basic_salary;
	        double da=(int)0.50*basic_salary;
	        
	        int total_salary= (int)Math.round(basic_salary + hra + da + allow - pf);
	        
	        
	        System.out.println(total_salary);
		}


		}
