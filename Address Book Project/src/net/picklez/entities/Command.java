package net.picklez.entities;

import net.picklez.managers.AddressBook;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:56:13
 * Base-Command class
 */

public abstract class Command {
	
	protected String name;
	protected String description;
	
	protected AddressBook addressBook;
	
	protected boolean hasArgs = false;
	
	/**
	 * Sets name and description for command
	 * @param name - Name
	 * @param desc - Description
	 */
	public Command(String name, String desc) {
		this.name = name;
		this.description = desc;
	}
	
	/**
	 * Returns the name of the command
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the description of the command
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Returns the current instance of the address book
	 */
	protected AddressBook getAddressBook() {
		return this.addressBook;
	}
	
	/**
	 * Returns true if command should take arguments
	 * @return
	 */
	public boolean hasArgs() {
		return this.hasArgs;
	}
	
	/**
	 * Internal method to set whether command should take arguments
	 * @param flag
	 */
	protected void setHasArgs(boolean flag) {
		this.hasArgs = flag;
	}
	
	/**
	 * Runs when command entered is equal to command name
	 */
	public abstract void onCommand();
	
	/**
	 * Method to run command with arguments
	 */
	public void onCommand(String args) {
		
	}

	/**
	 * Sets the address book variable to current instance of address book
	 * @param addressBook
	 */
	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}
	
	/**
	 * Logging method to print with tag of command name 
	 */
	protected void print(String s) {
		System.out.println("[" + this.getName() + "] " + s);
	}
}
