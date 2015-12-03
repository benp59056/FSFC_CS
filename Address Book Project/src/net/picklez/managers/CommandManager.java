package net.picklez.managers;

import java.util.ArrayList;
import java.util.Scanner;

import net.picklez.commands.*;
import net.picklez.entities.Command;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:59:05
 */

public class CommandManager {

	private ArrayList<Command> commands;
	private static CommandManager commandManager;

	public CommandManager(AddressBook addressBook) {
		commandManager = this;
		this.commands = new ArrayList<Command>();
		this.commands.add(new CommandHelp());
		this.commands.add(new CommandExit());
		this.commands.add(new CommandDisplay());
		this.commands.add(new CommandAddPerson());
		this.commands.add(new CommandFindPerson());
		
		for (Command c : this.commands) {
			c.setAddressBook(addressBook);
		}
	}

	public static CommandManager getInstance() {
		return commandManager;
	}

	public void processInput(Scanner scanner) {
		boolean found = false;
		String line = scanner.nextLine();
		for (Command c : this.commands) {
			if (line.toLowerCase().startsWith(c.getName().toLowerCase())) {
				c.onCommand();
				if (c.hasArgs()) {
					c.onCommand(line.substring(c.getName().length() + 1, line.length()));
				}
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Could not process input, please enter \"help\" if you need assistance");
		}
	}

	public ArrayList<Command> getCommands() {
		return this.commands;
	}
}