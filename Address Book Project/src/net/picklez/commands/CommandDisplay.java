package net.picklez.commands;

import net.picklez.entities.Command;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 16:08:42
 */

public class CommandDisplay extends Command {

	public CommandDisplay() {
		super("Display", "Displays the current address book");
	}

	public void onCommand() {
		this.getAddressBook().dumpData();
	}
}