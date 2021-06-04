package classesAndObjects;
import java.util.Scanner;
public class studentUse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		studentclass s1= new studentclass("Reet", 36);
		  //s1.name = "Reet";
		  //s1.setrollNumber(-23);
		  s1.print();
		  
		  studentclass s2= new studentclass("Paavni", 24);
	      System.out.println(s2); 
		  s2.print();
		  //s2.name = "Paavni";
//		  s2.setrollNumber(-12);
          System.out.println(s1.name);	  
	      System.out.println(s1);//"this" is referring to where s1 is stored
// 		  System.out.print(s2.name);
	      //System.out.println(s1.numStudents);
	      //System.out.println(s2.numStudents);
	      //how many students are there? 2
	      //that will remain same regardless ifyou access it through s1 or s2
//		  better way to access a static value is through class
	      System.out.println(studentclass.numStudents);
//		  System.out.println(s2.getrollNumber());
//		  System.out.println(s2.getrollNumber());
//		   

	}

}
