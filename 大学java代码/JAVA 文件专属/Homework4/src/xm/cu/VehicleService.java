package xm.cu;

public class VehicleService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle vehicle = new Bicycle(20,5);
      
      vehicle.display(vehicle.getDistance());
      
      vehicle  = new Car(100,10,5);
      
      vehicle.display(vehicle.getDistance());
	}
	

}
