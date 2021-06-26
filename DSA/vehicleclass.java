package vehicle;

public class vehicleclass {
       protected String color;
       private int maxSpeed;
       
       public vehicleclass() {//default constructor
    	   System.out.println("vehicle constructor");
       }
       
       public void vehilceclass(int maxSpeed) {
    	   this.maxSpeed = maxSpeed;
    	   System.out.println("vehicle constructor");
       }
       
       public int getmaxSpeed(){
    	   return maxSpeed;
       }
       
       public void setmaxSpeed(int maxSpeed) {
    	   this.maxSpeed = maxSpeed; 
       }
       public void print() {
    	   System.out.println("Vehicle color:" + color);
    	    System.out.println("maxSpeed: " + maxSpeed);
    	     
       }
}
