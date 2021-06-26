package vehicle_temp;
import vehicle.vehicleclass;
public class truck extends vehicleclass {
      int maxLoadingCapacity;
      public void print() {
    	  System.out.println("Truck capacity:" + maxLoadingCapacity);
    	  System.out.println("Truck color: " + color);//cant access color, make color protected
    	  System.out.println("truck max speed" + getmaxSpeed());
    	  
      }
}
