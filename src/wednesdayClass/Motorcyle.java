package wednesdayClass;

public class Motorcyle extends Vehicle {
	
	public Motorcyle(){
		
		// first  line  of any  constructor will try   to  call its super  class`s
		//no  argument  constructor or  you  can  call other  constructor from  super  class
		super();
	}
	
	
	@Override
	public  void driveIt(){
		
		System.out.println("Driving a  motorcycle");
	}

}
