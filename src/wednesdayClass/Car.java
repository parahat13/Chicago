package wednesdayClass;

public class Car extends Vehicle {
	
	public Car(){
		// first  line  of any  constructor will try   to  call its super  class`s
		//no  argument  constructor or  you  can  call other  constructor from  super  class
	super("Car", 1234);	
	
	}
	
	public Car(String aCarType, int aCarMileage){
		super(aCarType,aCarMileage);
		
	}

	@Override
	public void driveIt() {
		
		//super.driveIt();
		System.out.println("Driving  a  car");
	}
	
	
}
