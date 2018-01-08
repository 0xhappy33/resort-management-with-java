package repos;

import java.util.ArrayList;
import java.util.Random;

import models.Customer;

public class Source {
	
	String[] villas = {"2 beds", "3 beds", "5 beds", "1 bed"};
	int[] priceOfVillas = {4,6,10,2};
	String[] houses = {"2 beds", "3 beds", "5 beds", "1 bed"};
	int[] priceOfHouses = {4,6,10,2};
	
	Customer customer;
	ArrayList<Customer> customers;
	
	@SuppressWarnings("unused")
	private void showVillas() {
		System.out.println("All villas of resort: ");
		for(int i = 0; i < villas.length; i ++) {
			System.out.println(i + ". " + villas[i] + " with $" + priceOfVillas[i]);
		}
	}
	
	@SuppressWarnings("unused")
	private void showHouses() {
		System.out.println("All houses of resort: ");
		for(int i = 0; i < houses.length; i ++) {
			System.out.println(i + ". " + houses[i] + " with $" + priceOfHouses[i]);
		}
	}
	
	@SuppressWarnings("unused")
	private void showAllCustomer() {
		Random ran = new Random();
		int Low = 10;
		int High = 30;
		customers = new ArrayList<>();
		for(int i = 0; i < 10; i ++) {
			customer = new Customer();
			customer.setmName("Customer " + i);
			customer.setmAge(ran.nextInt(High - Low) + Low);
			customers.add(customer);
		}
		
		for(int i = 0 ; i < customers.size(); i ++) {
			System.out.println(i + ". " + customers.get(i));
		}
	}
	
	public static void main(String[] args) {
		Source cs = new Source();
		// cs.showVillas();
		//cs.showHouses();
		cs.showAllCustomer();
	}
}
