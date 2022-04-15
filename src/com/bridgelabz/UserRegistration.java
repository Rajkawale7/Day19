package com.bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {

	public static void main(String[] args) {
		//As a User need to a follow predefined mobile number format
		Scanner scan = new Scanner (System.in);
		int ch = 1;
		do {
		System.out.println("Enter Your Mobile Number: ");
		String MobNumber = scan.next();
		
		String regex = ("(0/91)?[7-9][0-9]{9}");
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(MobNumber);
		
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

//(0/91): number starts with (0/91)  
//[7-9]: starting of the number may contain a digit between 0 to 9  
//[0-9]: then contains digits 0 to 9
