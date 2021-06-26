package classesandobj;

public class complexnumberuse {

	public static void main(String[] args) {
		 complexnumbers c1 = new complexnumbers(2,3);
	        c1.print();
	        //c1.setreal(4);
	        //c1.setimaginary(10);
	        c1.print();

	        complexnumbers c2 = new complexnumbers(2,3);
	        c1.plus(c2);
	        c1.print();
	        c2.print();

	        complexnumbers c3 = new complexnumbers(2,3);
	        c3.multiply(c2);
	        c3.print();
	        c2.print();

	        complexnumbers c4 = complexnumbers.plus(c1,c2);
	        c1.print();
	        c2.print();
	        c4.print();
	    }

	

}
