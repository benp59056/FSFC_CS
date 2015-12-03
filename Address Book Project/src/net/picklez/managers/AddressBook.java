package net.picklez.managers;

import java.util.ArrayList;

import net.picklez.entities.File;
import net.picklez.entities.Person;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:24:57
 */

public class AddressBook {

	private ArrayList<Person> people;
	private File file;
	
	public AddressBook(File file) {
		this.people = new ArrayList<Person>();
		this.file = file;
	}
	
	public void populate() {
		for (String s : this.file.getLines()) {
			if (!s.equals("Name,DoB,Address,Postcode,Gender,Telephone") && s.trim() != "") {
				String[] split = s.split(",");
				this.people.add(new Person(split[0], split[1], split[2], split[3], split[4], split[5]));
			}
		}
	}
	
	public void addPerson(Person p) {
		this.people.add(p);
		this.updateFile();
	}
	
	public void removePerson(Person p) {
		this.people.remove(p);
		this.updateFile();
	}
	
	private void updateFile() {
		String result = "Name,DoB,Address,Postcode,Gender,Telephone";
		
		for (Person p : this.people) {
			result += "\n" + p.asCSVFormat();
		}
		
		this.file.writeOverFile(result);
	}
	
	public ArrayList<Person> getPeople() {
		return this.people;
	}
	
	public void dumpData() {
		System.out.println("Dumping address book:");
		for (Person p : people) { 
			System.out.println(p.asString());
		}
	}
}