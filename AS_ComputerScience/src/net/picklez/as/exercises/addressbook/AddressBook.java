package net.picklez.as.exercises.addressbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 10:16:16
 */

public class AddressBook {
	
	private Book book;
	private ArrayList<Person> people;
	
	public AddressBook() {
		this.init();
		this.loadFile();
		this.convertBook();
	}
	
	public static void main(String[] args) {
		new AddressBook();
	}
	
	private void init() {
		this.log("Starting up address book...");
		this.people = new ArrayList<Person>();
		this.book = new Book();
		this.log("Finished set-up");
	}
	
	private void loadFile() {
		this.log("Loading address book from file");
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\CompUser\\My Documents\\bookAsCSV.csv"));
			String line = br.readLine();
			while (line != null) {
				this.book.addLine(line);
				this.log(line);
				line = br.readLine();
			}
			br.close();
			this.log("Address book loaded successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void convertBook() {
		int count = 0;
		for (String s : this.book.getLines()) {
			if (count > 0) {
				
			}
			count++;
		}
	}
	
	private void log(String s) {
		System.out.println(s);
	}
}