package cars;

public class Cars2 {
	
	public static void main(String[] args) {
		
//		Cars myCar=new Cars();
//		
//		myCar.make="Toyota";
//		myCar.model="Camry";
//		myCar.year=2012;
//		myCar.price=11000;
//		myCar.color="Black";
//		
//		
//		System.out.println(myCar.make);
//		System.out.println(myCar.model);
//		
//		myCar.goForward();
//
//		myCar.goBack();
		
		Cars car1=new Cars();
		Cars car2=new Cars();
		
		car1.make="Toyota";
		car2.make="Honda";
		
		car1.goForward();
		car1.goBack();
			
		
		car2.goForward();
		car2.goBack();
	}

}
