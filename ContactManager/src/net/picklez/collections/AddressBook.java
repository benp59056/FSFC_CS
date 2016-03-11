package net.picklez.collections;

import java.util.ArrayList;

import net.picklez.entities.Contact;
import net.picklez.gui.GuiFrame;
import net.picklez.utils.files.PFile;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:08:25
 * Description: An address book to hold all contacts
 */
public class AddressBook {

	private ArrayList<Contact> contacts;
	private PFile file;

	/**
	 * Creates address book with file path as parameter
	 */
	public AddressBook(String s) {
		this.contacts = new ArrayList<Contact>();
		this.setFile(s);
		this.file.loadContent();
	}

	/**
	 * Adds contact to array
	 */
	public void addContact(Contact c) {
		this.contacts.add(c);
		this.getFile().writeToFile(this.getBookAsFileContent());
	}

	/**
	 * Sets the file from file path
	 */
	public void setFile(String s) {
		this.file = new PFile(s);
	}

	/**
	 *  Returns the file
	 */
	public PFile getFile() {
		return this.file;
	}

	/**
	 * Populates the array using file
	 */
	public void populate() {
		for (String s : this.file.getLines()) {
			String[] split = s.split(",");
			if (split.length == 6)
				this.contacts.add(new Contact(split[0], split[1],split[2],split[3],split[4],split[5]));
			else
				GuiFrame.log("Failed to process line: '" + s + "'");
		}
	}

	public ArrayList<Contact> getContacts() {
		return this.contacts;
	}
	
	/**
	 * Debug method to print off book
	 */
	public void printBook() {
		for (Contact c : this.contacts) {
			GuiFrame.log(c.asString());
		}
	}

	public String[] getContactsAsStringArray() {
		String[] contacts = new String[this.contacts.size()];

		int i = 0;
		for (Contact c : this.contacts) {
			contacts[i] = c.getName();
			i++;
		}
		return contacts;
	}
	
	public Contact getContactFromName(String name) {
		Contact contact = null;
		
		for (Contact c : this.contacts) {
			if (c.getName().equals(name)) 
				contact = c;
		}
		
		return contact;
	}

	public void removeContact(Contact c) {
		this.contacts.remove(c);
		this.getFile().writeToFile(this.getBookAsFileContent());
	}
	
	public void replaceContact(Contact c, Contact c2) {
		this.contacts.set(this.contacts.indexOf(c), c2);
		this.getFile().writeToFile(this.getBookAsFileContent());
	}
	
	public String getBookAsFileContent() {
		String result = "//Name,DoB,Address,Postcode,Gender,Telephone\n";
		for (Contact c : this.contacts) {
			result += c.asFileFormat() + "\n";
		}
		return result;
	}
}