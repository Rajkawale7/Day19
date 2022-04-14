package com.bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	public static void main(String[] args) {
		//As a User need to a valid Email ID
		Scanner scan = new Scanner (System.in);
		int ch = 1;
		do {
		System.out.println("Enter Your Email: ");
		String Email = scan.next();
		
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(Email);
		
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
