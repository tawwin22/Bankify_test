package ControlStatements;

import java.util.Scanner;

public class ATMPinCheck {

	public static void main(String[] args) {
		int pin = 1234;
		int attempt = 0;
		try(Scanner sc = new Scanner(System.in)){
			while (attempt < 3) {
				System.out.println("Enter Pin: ");
				int userInput = sc.nextInt();
				
				if (userInput != pin) {
					System.out.println("Incorrect Pin. Try again!");
					attempt++;
					
					if (attempt == 3) {
						System.out.println("Your card is blocked");
					}	
				} 
				else if (userInput == pin) {
					System.out.println("Access Granted!");
					break;
				}
			}
		}
	

	}
}

