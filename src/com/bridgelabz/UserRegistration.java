package com.bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	public static void main(String[] args) {
		//As a User need to a follow predefined Unique Password format.
		Scanner scan = new Scanner (System.in);
		int ch = 1;
		do {
		System.out.println("Enter Your Unique Password: ");
		String password = scan.next();
		
		//Compiling the regex
		String regex = "^(?=.*[0-9])"
				+ "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);	
		
		if (m.find()) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}
		
		//To continue the same process by using do while loop
		System.out.println("Continue...press 1,");
		ch = scan.nextInt();
		} 
		while(ch==1);	
	}
}