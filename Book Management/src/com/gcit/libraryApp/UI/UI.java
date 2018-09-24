package com.gcit.libraryApp.UI;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.gcit.libraryApp.DB.DB;
import com.gcit.libraryApp.GenericFunction.GenericFunctions;

public class UI implements UserInterface {
	private DB db;

	private LibrarySelected ls;
	private AdministratorSelected as;
	private BorrowerSelected bs;
	private GenericFunctions gf;

	private Connection conn;

	private enum options {
		LIBRARIAN, ADMINISTRATOR, BORROWER
	};

	public UI() {
		try {
			db = new DB();
			conn = db.connectToDataBase();
			gf = new GenericFunctions();

			ls = new LibrarySelected(conn, gf);
			as = new AdministratorSelected(conn, gf);
			bs = new BorrowerSelected(conn, gf);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		Menu();
	}

	public void Menu() {
		int user = 0;
		while (true)
			user = switchMenu(user);
	}

	private int switchMenu(int user) {
		switch (user) {
		case 1:
			user = Library(user);
			break;
		case 2:
			user = Administrator(user);
			break;
		case 3:
			user = Borrower(user);
			break;
		default:
			gf.println("Welcome to the GCIT Library");
			for (options option : options.values())
				gf.println((option.ordinal() + 1) + ") " + option);
			try {
				user = Integer.parseInt(gf.stringCondition());
				if (user != 0)
					break;
			} catch (InputMismatchException | NumberFormatException e) {
				user = 0;
			}
			break;
		}
		return user;
	}

	@Override
	public int Library(int option) {
		try {
			option = ls.lib1();
		} catch (NumberFormatException e) {
			option = 0;
		}
		return option;
	}

	@Override
	public int Administrator(int option) {
		try {
			option = as.adminMenu();
		} catch (NumberFormatException e) {
			option = 0;
		}
		return option;
	}

	@Override
	public int Borrower(int option) {
		try {
			option = bs.brr1();
		} catch (NumberFormatException e) {
			option = 0;
		}
		return option;
	}

}
