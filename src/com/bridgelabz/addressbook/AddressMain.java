package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressMain {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		
		ContactPerson Cp = new ContactPerson();

		System.out.println(" --------- Enter the details in the Address Book --------- ");
		System.out.println();
		
		String action = null;
		do {
			System.out.println(" \n Enter what action you want to perform: ");
			System.out.println(" \n 1. Add  \n 2. Edit	\n 3. Delete  \n 4. Exit");
			action = sc.next();
			
			switch (action) {
			
			case "add":
				Cp.add();
				break;
				
			case "edit":
				Cp.edit();
				break;
			
			case "delete":
				Cp.delete();
				break;
			}
		}while(action != "exit");
		
	}
			
}
