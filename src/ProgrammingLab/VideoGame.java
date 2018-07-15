package ProgrammingLab;

import java.util.Scanner;

public class VideoGame {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number  of coupon  :");
		
		int couponSize = s.nextInt();
		
		int candyBar = couponSize/10;
		int remainingCoupon = couponSize % 10;
		int gumballs = (couponSize%10)/3;
		
		System.out.println("Number  of  candy : "+ candyBar);
		System.out.println("Number  of  gumballs : "+gumballs);
		
		int couponLeft = (remainingCoupon)%3;
		
		System.out.println("number of  coopon left :" + couponLeft);
		
		
	}

}
