package resort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import models.BeachHouse;
import models.SwimmingPool;
import models.Villa;
import solution.Actions;

public class Solution {
	private Scanner sc;
	private Object obj;
	
	private int n;
	private int numberOfDaysStay;
	
	private String checkInDate, checkOutDate;
	
	
	public void inputInformationOfCustomer() throws ParseException {
		sc = new Scanner(System.in);
		
		System.out.println("What do you rent: ");
		System.out.println("1. Vila or 2.Beach house");
		
		// check menu the customer ordered
		checkEnterMenu();
		
		// check days the customer stays here
		checkEnterDaysStay();
		
		
		switch(n) {
			case 1: 
				obj = new Villa();
				//displayBill();
				System.out.println("Total bill: $" + ((Villa) obj).getmPrice() * numberOfDaysStay);
				break;
			case 2:
				obj = new BeachHouse();
				//displayBill();
				System.out.println("Total bill: $" +((BeachHouse) obj).getmPrice() * numberOfDaysStay);
				break;
			default:
				break;
		}
		
		//displayBill();
	
	}
	
	public void checkEnterMenu() {
		do {
			n = sc.nextInt();
			if(n<0 || n>2) {
				System.out.println("Please enter again: ");
			}
		}while(n < 0 || n > 2);
	}
	
	
	
	public void checkEnterDaysStay() throws ParseException {
		System.out.println("How many days do you stay here: ");
		
		SimpleDateFormat theFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter check-in date (dd/mm/yyyy): ");
		checkInDate = sc.next();
		System.out.println("Enter check-out date (dd/mm/yyyy): ");
		checkOutDate = sc.next();
		
		Date cInDate = theFormat.parse(checkInDate);
		Date cOutDate = theFormat.parse(checkOutDate);
		
		
		long diff = cOutDate.getTime() - cInDate.getTime();
		numberOfDaysStay = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		// System.out.print(numberOfDaysStay);
	}
	
	
	public void displayBill() {
		System.out.println("Total of bills: " + obj);
	}
	
	public void recomendationForDaysToStayWithMoney(int money) {
		switch(money) {
			case 100:
				System.out.print("You can stay here in " + recomendation(obj, money));
				break;
			case 50:
				System.out.print("You can stay here in " + recomendation(obj, money));
				break;
			case 30:
				System.out.print("You can stay here in " + recomendation(obj, money));
				break;
			default:
				System.out.println("Hehe");
				break;
		}	
	}
	
	public int recomendation(Object obj, int money) {
		if(obj instanceof Villa) {
			return (int) (money / ((Villa)obj).getmPrice());
		}else
			if(obj instanceof BeachHouse) {
				return (int) (money / ((BeachHouse)obj).getmPrice());
			} 
		return 0;
	}
	
	public static void main(String[] args) {
		SwimmingPool sp = new SwimmingPool("10:00");
		System.out.println(sp);
		
		Solution solution = new Solution();
		try {
			solution.inputInformationOfCustomer();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//solution.displayBill();
	}
}
