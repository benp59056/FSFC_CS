package net.picklez.commands;

import net.picklez.entities.Command;
import net.picklez.managers.CommandManager;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:57:54
 */

public class CommandHelp extends Command{

	public CommandHelp() {
		super("Help", "Displays help menu");
	}

	public void onCommand() {
		for (Command c : CommandManager.getInstance().getCommands()) {
			this.print(c.getName() + " - " + c.getDescription());
		}
	}
}