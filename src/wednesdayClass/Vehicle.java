package wednesdayClass;

public class Vehicle {
	private String vehicleType;
	private  int mileage;
	
	//constructor
	public Vehicle(){
		System.out.println("A message from vehicle no parametr/argument constructor");
	}
	
	
	public Vehicle(String aType, int aMileage){
	
		this.vehicleType=aType;
	    this.mileage=aMileage;
	    System.out.println("A message from vehicle"+ "two parametr/argument constructor");
		
	}


	public String getVehicleType() {
		return vehicleType;
	}

	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
	
		return "Vehicle type: "+vehicleType+" "+ "mileage: "+mileage;
	}
	
	public void  driveIt(){
		System.out.println("Driving a  vehicle");
	}
	
	
	
	private void secretMethod(){
		System.out.println("secret is  secret, it  only stay inside  this  class");
		
	}
	
	protected void kindaSecretMethod(){
		
		System.out.println("this  is kinda   secret, it  only stay inside  this  class");
	}
	

	
	

}
