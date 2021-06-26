package vehicle;

public class vehicleuse {

	public static void main(String[] args) {
//		vehicleclass v = new vehicleclass();
//		v.print();
		
		vehicleclass v = new car();
		
		v.print();
		
		car c = new car(10,20);
		c.numGears =10;
		c.color = "black";
		
		// c.maxSpeed = 100 ;
		v.setmaxSpeed(100);
        //c.print(); //what to call car or vehicle? check hierachy 
        c.getmaxSpeed();
        c.color="black";
        
	}

}
