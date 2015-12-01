package net.picklez.as.exercises.addressbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 10:16:16
 */

public class AddressBook {
	
	private Book book;
	
	public AddressBook() {
		this.init();
		this.loadFile();
	}
	
	public static void main(String[] args) {
		new AddressBook();
	}
	
	private void init() {
		this.log("Starting up address book...");
	}
	
	private void loadFile() {
		this.book = new Book();
		this.log("Loading address book from file");
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\CompUser\\My Documents\\bookAsCSV.csv"));
			String line = br.readLine();
			while (line != null) {
				this.book.addLine(line);
				line = br.readLine();
			}
			br.close();
			this.log("Address book loaded successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void log(String s) {
		System.out.println(s);
	}
}