package vehicle;

public class car extends vehicleclass {
	super(maxSpeed);   
    int numGears;
    boolean isconvertible;

    public car(int numGears) {
    	//super(100)
    	this.numGears = numGears;
    	System.out.println("car constructor");
    }
    
    
    public boolean isconvertible() {
    	return isconvertible; 
    }
    public void print() {
    	super.print();
    	
    	 //System.out.println("car color:" + color);
 	     //System.out.println("car maxSpeed: " + getmaxSpeed());
 	    System.out.println("Car numGears:" + numGears);
	    System.out.println("car isConvertible:" + isconvertible);
    }
     
}

 