package ProgrammingLab;

public class Energy {
	
	public static void main(String[] args) {
		
	int running=10;
	int basketball=8;
	int sleeping = 1;
	
	double kilos = 150/2.2;
	
	double caloriesjMinuteRunning =0.0175*running*30*kilos;
	double caloriesjMinuteBasketball =0.0175*basketball*30*kilos;	
	double caloriesjMinuteSleeping =0.0175*sleeping*6*60*kilos;
	
	double totalCalory = caloriesjMinuteRunning+caloriesjMinuteBasketball+caloriesjMinuteSleeping;
	System.out.println("total calory burned : "+totalCalory);
	
	}
	

}
