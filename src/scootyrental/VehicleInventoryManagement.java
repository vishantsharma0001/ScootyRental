package scootyrental;

import java.util.List;

import scootyrental.Product.Vehicle;



public class VehicleInventoryManagement {
	
	  List<Vehicle> vehicles;

	    VehicleInventoryManagement(List<Vehicle> vehicles) {
	    	
	        this.vehicles = vehicles;
	    }

	    public List<Vehicle> getVehicles() {
	        //filtering
	        return vehicles;
	        
	    }

	    public void setVehicles(List<Vehicle> vehicles) {
	    	
	        this.vehicles = vehicles;
	        
	    }

}
