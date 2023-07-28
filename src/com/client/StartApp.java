package com.client;

import java.util.Scanner;

import com.beans.EmployeePojo;
import com.dao.EmployeeDao;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("******************** Welcome to Employee Management System. ********************\n");
		System.out.println("1.  Press 1 to insert employee record.");
		System.out.println("2.  Press 2 to display all employees records.");
		System.out.println("3.  Press 3 to update employee record. ");
		System.out.println("4.  press 4 to delete employee record. ");
		System.out.println("5.  press 5 exit from app.");
		System.out.println("6.  press 6 show only mentioned employee record ");

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your choice:");
		int choice = sc.nextInt(); // here we will get user input in form of integer.

		switch (choice) {

		case 1: {
			System.out.println("please enter employee details to insert..\n");
			System.out.println("please enter emp id:");
			int id = sc.nextInt();

			System.out.println("please enter emp name");
			String ename = sc.next();

			System.out.println("please enter emp designantion");
			String desig = sc.next();

			System.out.println("please enter emp address");
			String adress = sc.next();

			EmployeePojo emp = new EmployeePojo(id, ename, desig, adress);
			
			if (EmployeeDao.insertRecord(emp)) {
				
			}


		}
			break;

		case 2:EmployeeDao.displyAllRecoreds();
			
			break;

		case 3: {

		}
			break;

		case 4: {

		}
			break;

		case 5: {

		}
			break;

		case 6: {

		}
			break;

		}

	}
}
