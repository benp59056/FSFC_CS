package net.picklez.commands;

import java.util.ArrayList;
import java.util.Scanner;

import net.picklez.commands.meetings.MeetingCommandExit;
import net.picklez.entities.Command;

/**
 * @author Ben Pickering
 * @since 4 Dec 2015 | 13:43:13
 * Collection of meeting commands
 */

public class CommandMeetings extends Command {

	private ArrayList<Command> commands;
	private boolean running = false;

	public CommandMeetings() {
		super("Meetings", "Gives access to meetings commands");
		this.commands = new ArrayList<Command>();

		this.commands.add(new MeetingCommandExit(this));

		this.setUsesScanner(true);
	}

	@Override
	public void onCommand() {

	}

	/**
	 * Method to process other command meetings
	 */
	@Override
	public void onCommandWithScanner(Scanner s) {
		this.running = true;
		this.print("List of commands for meetings:");

		for (Command c : this.commands) {
			this.print(c.getName() + " - " + c.getDescription());
		}

		while (this.running && s.hasNext()) {
			String command = s.nextLine();
			boolean found = false;

			for (Command c : this.commands) {
				if (command.toLowerCase().startsWith(c.getName().toLowerCase())) {
					c.onCommand();
					found = true;
					break;
				}
			}
			
			if (!found) {
				this.print("Unknown meetings command.");
			}
		}
	}

	/**
	 * Method to stop meetings command from running
	 */
	public void stopRunning() {
		this.running = false;
	}
}
