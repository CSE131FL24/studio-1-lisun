package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	int year=in.nextInt();
	int evenlyfour=year%4;
	int dvdhun=year%100;
	int evenlyfourhun=year%400;
	boolean leapornot = evenlyfour==0||dvdhun!=0||evenlyfourhun==0;
	System.out.print(year+" is a leap year:"+leapornot);
	}
	
}
