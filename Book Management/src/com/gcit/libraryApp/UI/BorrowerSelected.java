package com.gcit.libraryApp.UI;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;

import com.gcit.libraryApp.Borrower.Checkout;
import com.gcit.libraryApp.GenericFunction.GenericFunctions;

public class BorrowerSelected {
	private Connection conn;
	private GenericFunctions gf;
	private Checkout checkout;
	private int branchId;
	private int size;

	private ArrayList<String> borrower;

	public BorrowerSelected(Connection conn, GenericFunctions gf) {
		checkout = new Checkout(conn, gf);
		borrower = null;
		this.conn = conn;
		this.gf = gf;

		size = 0;
		branchId = 0;
	}

	public int brr1() {
		int option = 0;

		gf.println("Enter your card number:");
		while (true) {
			option = Integer.parseInt(gf.stringCondition());
			borrower = checkout.varifyCardNumber(conn, option);
			if (Integer.parseInt(borrower.get(0)) == option)
				break;
		}

		option = 0;
		while (true) {
			option = brr1(option);
			if (option == 3)
				return 0;
		}
	}

	public int brr1(int option) {
		switch (option) {
		case 1:
			option = option1();
			break;
		case 2:
			option = option2();
			break;
		default:
			gf.println("1) Check out a book");
			gf.println("2) Return a book");
			gf.println("3) Quit to previous");
			option = gf.integerCondition();
			break;
		}
		return option;
	}

	public int option1() {
		int option = 0;
		while (true) {
			option = option1(option);
			if (option == size)
				return 0;
		}
	}

	public int option1(int option) {
		switch (option) {
		case 0:
			gf.println("Pick out the branch you want to checkout from:");
			size = gf.viewTable(conn, "tbl_library_branch");
			gf.println(size + ") Quit to previous");
			option = gf.integerCondition();
			branchId = option;
			break;
		default:
			gf.println("Pick the book you want to check out:");
			size = checkout.showTextBookAvailable(conn, branchId);
			if (size == 0) {
				gf.println("Sorry no available book for that branch");
				size = option;
			} else {
				option = gf.integerCondition();
				checkout.updateBookRecord(conn, borrower, branchId, checkout.getCurrentTableKey(option));
				gf.println("Book checked out successful");
				option = size;
			}
			break;
		}
		return option;
	}

	public int option2() {
		int option = 0;
		while (true) {
			option = option2(option);
			if (option == size)
				return 0;
		}
	}

	public int option2(int option) {
		switch (option) {
		case 0:
			gf.println("Pick out the branch you want to return the book to:");
			size = gf.viewTable(conn, "tbl_library_branch");
			gf.println(size + ") Quit to previous");
			option = gf.integerCondition();
			branchId = option;
			break;
		default:
			gf.println("Pick the book you want to return:");
			size = checkout.showTextBookAvailable(conn, branchId, Integer.parseInt(borrower.get(0)));
			if (size == 0) {
				gf.println("Sorry no available books checkout for this branch");
				size = option;
			} else {
				option = gf.integerCondition();
				checkout.updateBookRecord(conn, Integer.parseInt(borrower.get(0)), branchId,
						checkout.getCurrentTableKey(option), checkout.getDateOut(option));
				gf.println("Book checked in successfully");
				option = size;
			}
			break;
		}

		return option;
	}

}
