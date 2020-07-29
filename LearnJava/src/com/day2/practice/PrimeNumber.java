package com.day2.practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
		System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}

	}

}
