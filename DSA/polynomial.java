package classesandobj;

public class polynomial {
	
	int coefficients[];
	
	public polynomial() {
		coefficients = new int[10];
	}
	public void setCoefficent(int deg, int coeff) {
		if(deg> coefficients.length -1) {

	  //create a new array with size = degree+1
			int temp[]=coefficients;
			coefficients = new int[deg +1];
			//copy values from temp to coefficients
			for(int i=0; i< temp.length; i++) {
				coefficients[i] = temp[i];
				}
		}
		coefficients[deg]= coeff;
	}
	public int getCoefficient(int deg) {
		
	}
	public int degree() {
		
	}
	//prints all the terms with non-zero coefficients
	public void print() {
		for(int i=0; i<coefficients.length;i++) {
			if(coefficients[i] != 0) {
				System.out.println("coefficients" + "x" + i + " ");
			}
		}
	}
	//add 2 polynomials and returns a new polynomial which has result
	public void add(polynomial p) {
		polynomial ans = new polynomial();
		int p1
	}
	public void multiply(polynomial p) {
		
	}
	public int evaluate(int x) {
		
	}
	public static polynomial add(polynomial p1, polynomial p2) {
		
	}

}
