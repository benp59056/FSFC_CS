package net.picklez.commands;

import net.picklez.entities.Command;
import net.picklez.entities.Person;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 16:15:35
 */

public class CommandAddPerson extends Command {
	
	public CommandAddPerson() {
		super("Add", "adds a person to address book -- please provide args: \"add name,dob,address,postcode,gender,phone\"");
		this.setHasArgs(true);
	}

	public void onCommand() {
		
	}
	
	@Override
	public void onCommand(String args) {
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
