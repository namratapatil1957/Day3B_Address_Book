package com.bridgelabz.addressbook;

import java.util.Scanner;

public class ContactPerson {
	
	Scanner sc = new Scanner (System.in);
	AddressBook person = new AddressBook();
	
	AddressBook[] arr = new AddressBook[10];
	
	int i = 0;
	int n = 2;

	void add(){
		
		for (int i = 0; i < n; i++) {
			System.out.println(" Enter the first name of the person: ");
			String fname = sc.next();
			person.setFname(fname);
			
			System.out.println(" Enter the last name of the person: ");
			String lname = sc.next();
			person.setLname(lname);
			
			System.out.println(" Enter the Address: ");
			String address = sc.next();
			person.setAddress(address);
			
			System.out.println(" Enter the city: ");
			String city = sc.next();
			person.setCity(city);
			
			System.out.println(" Enter the State: ");
			String state = sc.next();
			person.setState(state);
			
			System.out.println(" Enter the Zip: ");
			int zip = sc.nextInt();
			person.setZip(zip);
			
			System.out.println(" Enter the phone: ");
			long phone_no = sc.nextLong();
			person.setPhone_no(phone_no);
			
			System.out.println(" Enter the email: ");
			String email = sc.next();
			person.setEmail(email);
		
			arr[i] = person;
			
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == null)
					break;
				System.out.println(arr[i]);
			}	
		}	
	}
}
