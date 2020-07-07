package com.annas.banking;

import java.io.Console;

public class Banking {
	private User mainUser;
	
	private static Console console = System.console();
	
//	private static void print(String text) {
//		System.out.println(text);
//	}
	
	public void welcomeMessage() {
		System.out.print("\033\143"); 
		System.out.println("Welcome to Anna's Bank");
		System.out.println("Please, choose from the following options:");
		System.out.println("1. Log In to your Account");
		System.out.println("2. Create a new Account");
		System.out.println("3. Exit");
	}
	
	public void registerNewAccount() {
		System.out.println("New Account Registration");
		String login = console.readLine("Enter your Login:");
		String password = console.readLine("Enter your password:");
		
		mainUser = new User(login, password);
		console.readLine("New Account ceated. Press enter to continue.");
	}
	public void userLogIn() {
		String login = console.readLine("Enter your Login:");
		String password = console.readLine("Enter your password:");
		
		if(login.equals(mainUser.getUsername()) && password.equals(mainUser.getPassword())) {
			
			System.out.println("Welcome " + mainUser.getFirstName() + "!");
		}
		
		else {
			console.readLine("Sorry, wrong password. Press enter to continue");
		}	
	}
	
	
	
	
	public static void main(String...args) {
		
		Banking bank = new Banking();
		while(true) {
			bank.welcomeMessage();
			
			
			String option = console.readLine("");
			if(option.equals("1")) {
				bank.userLogIn();
			}
			
			if(option.equals("2")) {
				bank.registerNewAccount();
			}
			if(option.equals("3")) {
				return;
			}
			
			
			
		}
		
	}

}
