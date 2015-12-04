package net.picklez.entities;

import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 4 Dec 2015 | 14:04:42
 * Class for each meeting
 */

public class Meeting {

	private ArrayList<Person> people;
	private Person meetingHolder;

	private String topic;
	private String notes;
	
	public Meeting(String topic) {
		this.people = new ArrayList<Person>();
		this.topic = topic;
	}
	
	
}