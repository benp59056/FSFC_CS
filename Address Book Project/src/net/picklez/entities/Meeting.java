package net.picklez.entities;

import java.util.ArrayList;
import java.util.Calendar;

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
	
	private int id;
	
	private Calendar date;
	
	public Meeting(String topic) {
		this.people = new ArrayList<Person>();
		this.topic = topic;
	}
	
	public Meeting(String topic, Person p) {
		this.people = new ArrayList<Person>();
		this.topic = topic;
		this.meetingHolder = p;
	}
	
	public ArrayList<Person> getPeople() {
		return this.people;
	}
	
	public Person getMeetingHolder() {
		return this.meetingHolder;
	}
	
	public String getTopic() {
		return this.topic;
	}
	
	public String getNotes() {
		return this.notes;
	}
	
	public int getID() {
		return this.id;
	}
	
	public void setMeetingHolder(Person p) {
		this.meetingHolder = p;
	}
	
	public void setTopic(String s) {
		this.topic = s;
	}
	
	public void addNote(String s) {
		this.notes += "\n" + s;
	}
	
	public void setID(int i) {
		this.id = i;
	}
	
	public void displayMeeting() {
		System.out.println("Meeting {");
		System.out.println("Topic: " + this.topic);
		System.out.println("Notes: " + this.notes);
		System.out.println("Attendees: ");
		for (Person p : this.people) {
			System.out.println("\t" + p.asString());
		}
		System.out.println("}");
	}
}