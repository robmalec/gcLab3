package co.grandcircus;

import java.util.Scanner;

public class Lab3 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Boolean doCont = true;
		int num = 0;
		while (doCont) {
			
			try {
				System.out.println("Please enter a number between 1 and 100");
				num = scn.nextInt();
				if ((num > 1) && (num < 100)) {
					//Checking if number is odd
					if ((num % 2) != 0) {
						//Code for odd numbers
						System.out.print(num + " Odd");
						if (num > 60) {
							System.out.print(" and over 60");
						}
						System.out.println(".");
					}
					else {
						//Code for even numbers
						if (num > 60) {
							System.out.print(num + " ");
						}
						System.out.print("Even");
						if (num <= 25){
							System.out.print(" and less than 25");
						}
						System.out.println(".");
					}
				}
				else {
					throw new Exception();
				}
			}
			catch (Exception e) {
				System.out.println("Looks like you did something wrong.");
			}
			Boolean exit = false;
			while (!exit) {
				System.out.println("Would you like to continue?  Please enter y for yes or n for no.");
				char cont = scn.next().toLowerCase().charAt(0);
				if (cont == 'n') {
					exit = true;
					doCont = false;
					break;
				}
				else if (cont == 'y') {
					exit = true;
				}
				else {
					System.out.println("Looks like you didn't enter a y or an n.  Let's try this again..........");
				}
			}
		}
	}
}
