package net.picklez.managers;

import net.picklez.entities.File;
import net.picklez.entities.Meeting;

import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 4 Dec 2015 | 14:10:54
 * Class to hold all previous meetings
 */

public class MeetingsManager {

	private ArrayList<Meeting> meetings;
	private File file;
	
	public MeetingsManager(File file) {
		this.file = file;
	}
	
	public void loadFromFile() {
		
	}
}