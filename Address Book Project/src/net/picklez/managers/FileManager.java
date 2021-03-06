package net.picklez.managers;

import net.picklez.entities.File;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:02:27
 * Class to manage custom files
 */

public class FileManager {

	private File file;

	/**
	 * Creates a new instance of File with path supplied
	 */
	public FileManager(String s) {
		this.file = new File(s);
	}

	/**
	 * Returns current file in manager
	 */
	public File getFile() {
		return this.file;
	}

	/**
	 * Creates an AddressBook object from file and populates it
	 */
	public AddressBook createBookFromFile() {
		AddressBook book = new AddressBook(this.file);
		book.populate();
		return book;
	}
	
	public MeetingsManager createMeetingsManagerFromFile() {
		MeetingsManager manager = new MeetingsManager(this.file);
		manager.loadFromFile();
		return manager;
	}
}