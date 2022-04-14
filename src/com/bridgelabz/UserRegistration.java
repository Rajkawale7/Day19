package com.bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	public static void main(String[] args) {
		//As a User need to a valid Last Name
		Scanner scan = new Scanner (System.in);
		int ch = 1;
		do {
		System.out.println("Enter Your Last Name: ");
		String l_name = scan.next();
		
		String regex = "^{1}[A-Z]+[a-z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(l_name);
		
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
