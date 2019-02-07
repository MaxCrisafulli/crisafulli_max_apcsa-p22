//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	private double newBill;
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	
	public void setNums() {
		newBill = 0;
	}
	
	public double getDiscountedBill(double bill)
	{
		if (bill >= 2000) {
			newBill = bill * (double)0.85;
			return newBill;
			
		}
		else {
			newBill = bill;
			return newBill;
		}
	}
	
	public void printNewBill() {
		System.out.printf("Bill after discount :: " + "%.2f",newBill);
	}
}