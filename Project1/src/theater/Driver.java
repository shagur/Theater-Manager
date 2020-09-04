package theater;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Scanner userAns = new Scanner(System.in);
		int ans = 0;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		Theater theater = new Theater("Random Theater", 100);

		showAllCommands();

		do {
			System.out.println("\nEnter selection:");

			try {
				ans = sc.nextInt();
			}catch (Exception ex){
				System.out.println("\nInvalid value please restart program and enter correct value");
				System.exit(1);
			}

			if(ans == 0) {
				theater.storeData();
				return;
			} else if(ans == 1) {

				System.out.println("\nEnter client name:");
				String clientName = userAns.nextLine();
				System.out.println("\nEnter client address:");
				String clientAddress = userAns.nextLine();
				System.out.println("\nEnter client phone:");
				String clientPhone = userAns.nextLine();

				theater.addClient(clientName, clientAddress, clientPhone);

			} else if(ans == 2) {

				System.out.println("\nEnter ID of client to be removed:");
				int clientID = userAns.nextInt();

				theater.removeClient(clientID);

			} else if(ans == 3){
				theater.listClients();
			} else if(ans == 4){

				System.out.println("\nEnter customer name:");
				String customerName = userAns.nextLine();
				System.out.println("\nEnter customer address:");
				String customerAddress = userAns.nextLine();
				System.out.println("\nEnter customer phone:");
				String customerPhone = userAns.nextLine();
				System.out.println("\nEnter customer Credit Card number:");
				String creditCardNumber = userAns.nextLine();
				System.out.println("\nEnter customer Credit Card expiry date in the form MM/YY:");
				String expiryDate = userAns.nextLine();

				theater.addCustomer(customerName, customerAddress, customerPhone, creditCardNumber, expiryDate);

			} else if(ans == 5) {

				System.out.println("\nEnter ID of customer to be removed:");
				int customerID = userAns.nextInt();

				theater.removeCustomer(customerID);

			} else if(ans == 6){

				System.out.println("\nEnter ID of customer:");
				int customerID = userAns.nextInt();
				userAns.nextLine();//clear input buffer
				System.out.println("\nEnter customer's Credit Card number:");
				String creditCardNumber = userAns.nextLine();
				System.out.println("\nEnter Credit Card Number expiry date in the form MM/YY:");
				String expiryDate = userAns.nextLine();

				theater.addCustomerCreditCard(customerID, creditCardNumber, expiryDate);

			} else if(ans == 7){

				System.out.println("\nEnter Credit Card number to be removed:");
				String creditCardNumber = userAns.nextLine();
				theater.removeCreditCard(creditCardNumber);

			} else if(ans == 8){
				theater.listCustomers();
			} else if(ans == 9){

				System.out.println("\nEnter name of the show:");
				String showName = userAns.nextLine();
				System.out.println("\nEnter ID of client:");
				int clientID = userAns.nextInt();
				userAns.nextLine();//clear input buffer
				System.out.println("\nEnter show start date in the format \"yyyy-MM-dd\":");
				String start = userAns.nextLine();
				System.out.println("\nEnter show end date in the format \"yyyy-MM-dd\":");
				String end = userAns.nextLine();
				System.out.println("\nEnter regular ticket price:");
				double price = userAns.nextDouble();

				Date startDate = df.parse(start);
				Date endDate = df.parse(end);

				theater.addShow(showName, clientID, startDate, endDate, price);

			} else if(ans == 10){
				theater.listAllShows();
			} else if(ans == 11){
				theater.storeData();
			} else if(ans == 12){
				theater = theater.loadFromDisk();
			} else if (ans > 12 && ans < 16){

				System.out.println("How many tickets will you buy:");
				int quantity = userAns.nextInt();
				System.out.println("What is your customer ID:");
				int customerID = userAns.nextInt();
				userAns.nextLine();//clear input buffer
				System.out.println("Enter your Credit Card number:");
				String creditCardNumber = userAns.nextLine();
				System.out.println("\nEnter show start date in the format \"yyyy-MM-dd\":");
				String start = userAns.nextLine();

				Date startDate = df.parse(start);

				theater.sellTicket(customerID, startDate, quantity, ans);

			} else if (ans == 16){

				System.out.println("Enter Client ID:");
				int clientID = userAns.nextInt();
				userAns.nextLine();//clear input buffer
				System.out.println("The Client's balance is:");
				theater.printClientBalance(clientID);
				System.out.println("Enter amount to pay Client:");
				double payment = userAns.nextDouble();
				theater.payClient(clientID, payment);
				System.out.println("The Client's balance is now:");
				theater.printClientBalance(clientID);

			} else if (ans == 17){

				System.out.println("\nEnter show start date in the format \"yyyy-MM-dd\":");
				String start = userAns.nextLine();

				Date startDate = df.parse(start);

				theater.printTicketsForDate(startDate);

			} else if (ans == 18){
				showAllCommands();
			}
			else{
				System.out.println("Input must be between 0-18, try again.");
			}

		} while (ans != 0);

	}//end main

	public static void showAllCommands(){
		System.out.println("\nWelcome to the Theater");
		System.out.println(" 0: Exit");
		System.out.println(" 1: Add a Client");
		System.out.println(" 2: Remove a Client");
		System.out.println(" 3: List all Clients");
		System.out.println(" 4: Add Customer");
		System.out.println(" 5: Remove Customer");
		System.out.println(" 6: Add Credit Card");
		System.out.println(" 7: Remove Credit Card");
		System.out.println(" 8: List all Customers");
		System.out.println(" 9: Add a Show");
		System.out.println("10: List all Shows");
		System.out.println("11: Store Data");
		System.out.println("12: Retrieve Data");
		System.out.println("13: Sell regular tickets");
		System.out.println("14: Sell advance tickets");
		System.out.println("15: Sell student advance tickets");
		System.out.println("16: Pay Client");
		System.out.println("17: Print all tickets for a certain day");
		System.out.println("18: Help");
	}//end show all commands

}//end all