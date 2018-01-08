package resort;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import models.BeachHouse;
import models.Customer;
import models.SwimmingPool;
import models.Villa;
import solution.Actions;

public class Solution {
	private Scanner sc;
	private Object obj;
	
	private int n;
	private int numberOfDaysStay;
	
	private String checkInDate, checkOutDate;
	
	private Customer cus;
	
	private String checkInHour;
	public void inputInformationOfCustomer() throws ParseException {
		sc = new Scanner(System.in);
		
		createCheckInHour();
		
		checkCustomerAndStoreInVariable();
		
		System.out.println("What do you rent: ");
		System.out.println("1. Vila or 2.Beach house");
		
		// check menu the customer ordered
		checkEnterMenu();
		
		// check days the customer stays here
		checkEnterDaysStay();
	}
	
	@SuppressWarnings("unused")
	private void displayAllCustomer() {
		displayTheCustomer();
		System.out.println("The time which the customer check in is : " + Calendar.getInstance().getTime());
		switch(n) {
			case 1: 
				obj = new Villa();
				displayBill(((Villa) obj).getPrice() * numberOfDaysStay);
				break;
			case 2:
				obj = new BeachHouse();
				displayBill(((BeachHouse) obj).getPrice() * numberOfDaysStay);
				break;
			default:
				break;
		}
		
	}
	
	
	@SuppressWarnings({ "unused", "deprecation" })
	private void createCheckInHour() {
		checkInHour = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("Now is : " + checkInHour);
		if(Calendar.getInstance().getTime().getHours() < 8) {
			System.out.println("Please check in later, after 9:00");
			return;
		}
	}
	
	private void displayTheCustomer() {
		System.out.println(cus);
		
	}

	public void checkCustomerAndStoreInVariable() {
		System.out.println("Please enter the customer with { Name and Age }: ");
		String name = sc.nextLine();
		int age = sc.nextInt();
		
		cus = new Customer(name, age);
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
	
	
	public void displayBill(float totalBill) {
		System.out.println("Total of bills: $" + totalBill);
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
			return (int) (money / ((Villa)obj).getPrice());
		}else
			if(obj instanceof BeachHouse) {
				return (int) (money / ((BeachHouse)obj).getPrice());
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
		solution.displayAllCustomer();
	}
}
