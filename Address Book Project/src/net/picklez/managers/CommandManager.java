package net.picklez.managers;

import java.util.ArrayList;
import java.util.Scanner;

import net.picklez.commands.*;
import net.picklez.entities.Command;
import net.picklez.utils.LevenshteinCalculator;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:59:05
 * Manages commands
 */

public class CommandManager {

	private ArrayList<Command> commands;
	private static CommandManager commandManager;

	/**
	 * Creates only instance of commands and sets their address book instance
	 */
	public CommandManager(AddressBook addressBook) {
		commandManager = this;
		this.commands = new ArrayList<Command>();
		this.commands.add(new CommandAddPerson());
		this.commands.add(new CommandDisplay());
		this.commands.add(new CommandExit());
		this.commands.add(new CommandFindPerson());
		this.commands.add(new CommandHelp());
		this.commands.add(new CommandMeetings());

		for (Command c : this.commands) {
			c.setAddressBook(addressBook);
		}
	}

	/**
	 * Returns the current instance of manager
	 */
	public static CommandManager getInstance() {
		return commandManager;
	}

	/**
	 * Processes input from console and sends data off to appropriate command
	 */
	public void processInput(Scanner scanner) {
		boolean found = false;
		Command closest = null;
		int closestCommand = 100;
		String line = scanner.nextLine();
		for (Command c : this.commands) {

			int distance = LevenshteinCalculator.compare(line, c.getName());
			if (distance < closestCommand) {
				closest = c;
				closestCommand = distance;
			}

			if (line.toLowerCase().startsWith(c.getName().toLowerCase())) {
				if (c.hasArgs()) {
					if (line.length() > c.getName().length() + 2) 
						c.onCommand(line.substring(c.getName().length() + 1, line.length()));
					else {
						System.out.println("Could not process parameters");
						c.onCommand();
					}
				} else if (c.shouldUseScanner()) {
					c.onCommandWithScanner(scanner);
				} else {
					c.onCommand();
				}
				found = true;
				System.out.println("Please enter another command: ");
				break;
			}
		}

		if (!found) {
			System.out.println("Did you mean \"" + closest.getName() + "\"? [y/n]");
			String inp = scanner.nextLine().toLowerCase();
			if (inp.startsWith("y")) 
				closest.onCommand();
			else 
				System.out.println("Okay. Please enter \"help\" if you need assistance. Input next command now:");

		}
	}

	/**
	 * Returns the commands as an arraylist
	 */
	public ArrayList<Command> getCommands() {
		return this.commands;
	}
}