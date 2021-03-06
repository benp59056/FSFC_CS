package net.picklez.commands.meetings;

import net.picklez.commands.CommandMeetings;
import net.picklez.entities.Command;

/**
 * @author Ben Pickering
 * @since 4 Dec 2015 | 13:57:36
 */

public class MeetingCommandExit extends Command {

	private CommandMeetings meetings;
	
	public MeetingCommandExit(CommandMeetings meetings) {
		super("Exit", "Exits out of meeting commands");
		this.meetings = meetings;
	}

	@Override
	public void onCommand() {
		this.meetings.stopRunning();
	}

}
