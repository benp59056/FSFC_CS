package net.picklez.commands;

import net.picklez.entities.Command;
import net.picklez.entities.Person;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 16:28:47
 * Command to find a person with query inputted
 */

public class CommandFindPerson extends Command {

	/**
	 * Uses super class to set variables
	 */
	public CommandFindPerson() {
		super("Find", "Finds a person with parameter given");
		this.setHasArgs(true);
	}

	public void onCommand() {
		
	}
	
	/**
	 * Searches through address book to find person matching search
	 * criteria
	 */
	@Override
	public void onCommand(String args) {
		boolean found = false;
		for (Person p : this.getAddressBook().getPeople()) {
			if (p.containsData(args)) {
				this.print("Found person matching query: " + p.asString());
				found = true;
			}
		}
		
		if (!found)
			this.print("Unable to find any entries matching data");
	}
}