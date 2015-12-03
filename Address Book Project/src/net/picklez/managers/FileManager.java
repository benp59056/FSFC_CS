package net.picklez.managers;

import net.picklez.entities.File;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:02:27
 */

public class FileManager {

	private File file;

	public FileManager(String s) {
		this.file = new File(s);
	}

	public File getFile() {
		return this.file;
	}
	
	public AddressBook createBookFromFile() {
		AddressBook book = new AddressBook(this.file);
		book.populate();
		return book;
	}
}