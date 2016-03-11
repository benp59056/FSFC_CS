package net.picklez.collections;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import net.picklez.entities.Contact;
import net.picklez.entities.Meeting;
import net.picklez.gui.GuiFrame;
import net.picklez.utils.files.PFile;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:09:19
 * Description: Collection of meetings
 */

public class MeetingBook {

	private ArrayList<Meeting> meetings;
	private PFile file;
	
	/**
	 * Creates meeting book with file of path s
	 */
	public MeetingBook(String s) {
		this.meetings = new ArrayList<Meeting>();
		this.setFile(s);
		this.file.loadContent();
	}
	
	/**
	 * Adds a meeting to the book 
	 */
	public void addMeeting(Meeting c) {
		this.meetings.add(c);
		this.getFile().writeToFile(this.getBookAsFileContent());
	}
	
	/**
	 * Sets the file using file path
	 */
	public void setFile(String s) {
		this.file = new PFile(s);
	}

	/**
	 * Returns the file
	 */
	public PFile getFile() {
		return this.file;
	}
	
	/**
	 * Populates the array using file
	 */
	public void populate() {
		for (String s : this.file.getLines()) {
			String[] split = s.split(",");
			//Meeting topic;ID;date;members
			if (split.length >= 4) {
				try {
//					Date date = new SimpleDateFormat("dd/mm/yyyy").parse(split[2]);
//					Calendar c = Calendar.getInstance();
//					c.setTime(date);
//					this.meetings.add(new Meeting(split[0], Long.parseLong(split[1]), c));
//
//					//using split[3] use regex to find and process contacts
//					//Contacts { Contact[Name='name'; DOB='dob'; Address='add'; Postcode='pc'; Gender='m'; Phone='num'] }
//					
					this.meetings.add(new Meeting(split[0], split[1], split[2], split[3]));
				} catch (Exception e) {
					System.err.println("Had an error whilst processing meeting from file");
					e.printStackTrace();
				}
			} else
				GuiFrame.log("Failed to process line: '" + s + "'");
		}
	}
	
	/**
	 * Debug method to print off book
	 */
	public void printBook() {
		for (Meeting m : this.meetings) {
			GuiFrame.log(m.asString());
		}
	}
	
	public Meeting getMeetingFromTopic(String topic) {
		Meeting meeting = null;
		for (Meeting m : this.meetings) {
			if (m.getTopic().equals(topic)) 
				meeting = m;
		}
		
		return meeting;
	}

	public ArrayList<Meeting> getMeetings() {
		return this.meetings;
	}
	
	public String[] getMeetingsAsStringArray() {
		String[] meetings = new String[this.meetings.size()];

		int i = 0;
		for (Meeting m : this.meetings) {
			meetings[i] = m.getTopic();
			i++;
		}
		return meetings;
	}

	public void removeMeeting(Meeting m) {
		this.meetings.remove(m);
		this.getFile().writeToFile(this.getBookAsFileContent());
	}
	public void replaceMeeting(Meeting c, Meeting c2) {
		this.meetings.set(this.meetings.indexOf(c), c2);
		this.getFile().writeToFile(this.getBookAsFileContent());
	}
	
	public String getBookAsFileContent() {
		String result = "//Meeting topic,ID,date,members\n";
		for (Meeting m : this.meetings) {
			result += m.asFileFormat() + "\n";
		}
		return result;
	}

}