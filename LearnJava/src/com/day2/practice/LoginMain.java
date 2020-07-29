package com.day2.practice;
import java.util.Scanner;
public class LoginMain {
public static void main(String[] args) {
		System.out.println("Enter the username:");
		Scanner sc= new Scanner(System.in);
		String u=sc.next();
		System.out.println("Enter the password");
		String p=sc.next();
		Login l=new Login(u,p);
		boolean b=l.validate();
		if(b==true) {
			System.out.println("Valid user");
		}
		else
			System.out.println("Invalid user");
		sc.close();
	}
}
