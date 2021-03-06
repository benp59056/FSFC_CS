package net.picklez.commands;

import net.picklez.entities.Command;
import net.picklez.entities.Person;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 16:15:35
 * A command to add a person to the address book
 */

public class CommandAddPerson extends Command {
	
	/**
	 * Uses super class to set variables
	 */
	public CommandAddPerson() {
		super("Add", "adds a person to address book -- please provide args: \"add name,dob,address,postcode,gender,phone\"");
		this.setHasArgs(true);
	}

	/**
	 * Method essential for all commands
	 */
	public void onCommand() {
		this.print("Please provide paramaters: name,dob,address,postcode,gender,phone");
		return;
	}
	
	/**
	 * Method to process command with arguments
	 */
	@Override
	public void onCommand(String args) {
		if (!args.contains(",")) {
			this.print("Parameters were incorrect");
			return;
		}
		String[] split = args.split(",");
		
		if (split.length < 6) {
			this.print("Please make sure you have enough parameters");
		} else {
			Person person = new Person(split[0], split[1], split[2], split[3], split[4], split[5]);
			this.addressBook.addPerson(person);
			this.print("Added person: " + person.asString());
		}
	}
}
