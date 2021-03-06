package net.picklez.commands;

import net.picklez.entities.Command;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 16:06:30
 * Command to exit program
 */

public class CommandExit extends Command {

	/**
	 * Uses super class to set variables
	 */
	public CommandExit() {
		super("Exit", "Closes application");
	}

	public void onCommand() {
		this.print("Exiting application");
		System.exit(0);
	}
}