package classObject;


import java.util.Scanner;

public class Author {

	
		//following are the instance variables of Book(Attributes)
				String name;
				String email;
				char gender;
				
				
				Scanner sc = new Scanner(System.in);
				public void readAuthorDetails() {
					
					System.out.println("Enter the author details");
					System.out.println("Enter the Name of Author");
					name = sc.next();
					System.out.println("Enter the email of Author");
					sc.nextLine();
					email = sc.nextLine();
					System.out.println("Enter the gender of Author");
					gender = sc.next().charAt(0);
					
				}
				
				public void getAuthorName() {
					
					//System.out.println("The Author Details");
					System.out.println("Author Name = " + name);
				}
				
				public void getAuthorEmail() {
					System.out.println("Author Email = "+ email);
				}
				
				public void getAuthorGender() {
					System.out.println("Author Gender = "+ gender);
					
				}

				

	}
