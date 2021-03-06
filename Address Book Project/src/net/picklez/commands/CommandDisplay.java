package net.picklez.commands;

import net.picklez.entities.Command;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 16:08:42
 * Command to display whole address book
 */

public class CommandDisplay extends Command {
	
	/**
	 * Uses super class to set variables
	 */
	public CommandDisplay() {
		super("Display", "Displays the current address book");
	}

	/**
	 * Uses the dumpData method in address book to print whole book
	 */
	public void onCommand() {
		this.getAddressBook().dumpData();
	}
}