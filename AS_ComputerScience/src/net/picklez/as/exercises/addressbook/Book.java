package net.picklez.as.exercises.addressbook;

import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 10:22:09
 */

public class Book {

	private ArrayList<String> lines;
	
	public Book() {
		this.lines = new ArrayList<String>();
	}
	
	public void addLine(String s) {
		this.lines.add(s);
	}
}