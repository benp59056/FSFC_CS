package net.picklez.as.exercises.linkedlists;

/**
 * @author Ben Pickering
 * @since 26 Nov 2015 | 11:09:18
 */

public class LalinLink {

	private String name;
	private int age;
	private String favBand = "Spice Girls";
	private boolean inARelationship = false;
	
	private LalinLink nextLink = null;
	
	public LalinLink(String name, int age, String faveBand, boolean relationship) {
		this.name = name;
		this.age = age;
		this.favBand = faveBand;
		this.inARelationship = relationship;
	}
	
	public void displayLink() {
		System.out.println("********");
		System.out.println(" ");
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Band: " + this.getFavBand());
		System.out.println("Relationship: " + this.getInRelationship());
		System.out.println(" ");
		System.out.println("********");
	}
	
	public void setName(String s) {
		this.name = s;
	}
	
	public void setAge(int i) {
		this.age = i;
	}
	
	public void setFavBand(String s) {
		this.favBand = s;
	}
	
	public void setRelationship(boolean flag) {
		this.inARelationship = flag;
	}
	
	public void setNextLink(LalinLink link) {
		this.nextLink = link;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getFavBand() {
		return this.favBand;
	}
	
	public boolean getInRelationship() {
		return this.inARelationship;
	}
	
	public LalinLink getNextLink() {
		return this.nextLink;
	}
}