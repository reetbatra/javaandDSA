package classesandobj;

public class polynomialUse {

	public static void main(String[] args) {
		polynomial p1= new polynomial();
		p1.setCoefficient(0,3);
		p1.setCoefficeint(2,2);
		p1.print();
		
		 polynomial p2= new polynomial();
		 p2.setCoefficient(0,3);
		 p2.setCoefficient(2,2);
		 p2.setCoefficient(1,4);
		 p2.setCoefficient(2,5);
		 p2.print();
		 
		 p1.add(p2);
		 p1.print(); //p1 becomes p1+p2
		 p2.print(); //no change in p2
		 
		 p2.multiply(p1);
		 p2.print();//p2=p1*p2
		 p1.print();//no change in p1
		  
         int ans = p2.evaluate(10);
         System.out.println(ans); 
	}

}
