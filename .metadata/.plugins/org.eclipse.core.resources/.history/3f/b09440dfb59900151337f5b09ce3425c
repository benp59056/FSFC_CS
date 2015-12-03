package net.picklez.entities;

import net.picklez.managers.AddressBook;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:56:13
 */

public abstract class Command {
	
	protected String name;
	protected String description;
	
	protected AddressBook addressBook;
	
	protected boolean hasArgs = false;
	
	public Command(String name, String desc) {
		this.name = name;
		this.description = desc;
	}
	
	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}
	
	protected AddressBook getAddressBook() {
		return this.addressBook;
	}
	
	public boolean hasArgs() {
		return this.hasArgs;
	}
	
	protected void setHasArgs(boolean flag) {
		this.hasArgs = flag;
	}
	
	public abstract void onCommand();
	
	public void onCommand(String args) {
		
	}

	public void setAddressBook(AddressBook addressBook) {
		this.addressBook = addressBook;
	}
	
	public void print(String s) {
		System.out.println("[" + this.getName() + "] " + s);
	}
}
