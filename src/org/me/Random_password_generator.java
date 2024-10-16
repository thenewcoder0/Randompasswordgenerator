package org.me;

import java.security.SecureRandom;
import java.util.Scanner;

public class Random_password_generator {
	public static void main(String[]args) {
		String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercase="abcdefghijklmnopqrstuvwxyz";
		String numbers="12345678910";
		String characters="!@#$%^&*()-_=+<>";
		
		String allchar = uppercase+lowercase+numbers+characters;
		
		SecureRandom sr= new SecureRandom();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the desiered length of your password");
		int passwordlength=s.nextInt();
		
		StringBuilder password = new StringBuilder(passwordlength);
		for(int i=0;i<passwordlength;i++) {
			int index=sr.nextInt(allchar.length());
			password.append(allchar.charAt(index));
		}
		System.out.println("The Generated Password is: "+password);
		s.close();
	}
}
