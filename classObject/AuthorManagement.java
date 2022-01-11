package classObject;

import java.util.*;
import java.util.Scanner;

public class AuthorManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// create a book object
		Author A = new Author();
		char ch = 'r';// local variable because it is defined inside main method

		while (ch == 'r') {
			System.out.println("Enter the choice.....");
			System.out.println("Enter 'input' to enter author details.....");
			System.out.println("Enter 'name' to view author name.....");
			System.out.println("Enter 'email' to view author name.....");
			System.out.println("Enter 'gender' to view author name.....");
			String transaction = sc.next();

			switch (transaction) {
			case "input":
				A.readAuthorDetails();
				break;
			case "name":
				A.getAuthorName();
				break;
			case "email":
				A.getAuthorEmail();
				break;
			case "gender":
				A.getAuthorGender();
				break;
			default:
				System.out.println("Wrong choice....");
				break;
			}// close of switch
			System.out.println("Enter 'r' to return for choice selection.....");
			ch = sc.next().charAt(0);
		   
		} // close of while

	}

}