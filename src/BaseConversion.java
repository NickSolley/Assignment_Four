
import java.util.Scanner;

/*
Class: CSE 1322L
Section: XX, replace with the actual section number.
Term: Spring 2020
Instructor: Kevin Markley
Name: My Name
Assignment 4
*/

public class BaseConversion {
	public static void main(String[] args) {
		System.out.println(RecursiveBaseConversion(692, 2));
	}

	public static String RecursiveBaseConversion(int number, int base) {

		int quotient = number / base;
		int remainder = number % base;

		if (quotient == 0) // base case
		{
			return Integer.toString(remainder);
		} else {
			return RecursiveBaseConversion(quotient, base) + Integer.toString(remainder);
		}
	}
}