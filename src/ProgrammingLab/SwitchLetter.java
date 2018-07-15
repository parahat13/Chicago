package ProgrammingLab;

public class SwitchLetter {
	
	public static void main(String[] args) {
		
	
	String firstName = "walt";
	String lastName = "savitch" ; 
	
	
	
	
	
	firstName = firstName.substring(1,2).toUpperCase()
				+firstName.substring(2)
				+firstName.substring(0,1)
				+"ay" ;
	
	lastName=  lastName.substring(1,2).toUpperCase()
			  +lastName.substring(2)
			  +lastName.substring(0,1)
			  +"ay";
	
	String pigLatin = firstName+ " " +lastName;
	System.out.println(pigLatin);
	
	
	}	

}
