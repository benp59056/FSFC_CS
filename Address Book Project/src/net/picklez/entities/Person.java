package net.picklez.entities;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:25:19
 */

public class Person {

	private String name;
	private String dateOfBirth;
	private String address;
	private String postcode;
	private String gender;
	private String telephone;
	
	/**
	 * Sets the variables of the class
	 */
	public Person(String name, String dob, String address, String postcode, String gender, String tele) {
		this.name = name;
		this.dateOfBirth = dob;
		this.address= address;
		this.postcode = postcode;
		this.gender = gender;
		this.telephone = tele;
	}
	
	/**
	 * Sets the name of the person
	 */
	public void setName(String s) {
		this.name = s;
	}
	 
	/**
	 * Sets the date of birth
	 */
	public void setDateOfBirth(String s) {
		this.dateOfBirth = s;
	}
	
	/**
	 * Sets the address
	 */
	public void setAddress(String s) {
		this.address = s;
	}
	
	/**
	 * Sets the postcode
	 */
	public void setPostcode(String s) {
		this.postcode = s;
	}

	/**
	 * Sets the gender
	 */
	public void setGender(String s) {
		this.gender = s;
	}
	
	/**
	 * Sets the phone number
	 * @param s
	 */
	public void setPhoneNumber(String s) {
		this.telephone = s;
	}
	
	/**
	 * Returns the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the date of birth 
	 */
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	/**
	 * Returns the address 
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Returns the postcode 
	 */
	public String getPostcode() {
		return this.postcode;
	}
	
	/**
	 * Returns the gender 
	 */
	public String getGender() {
		return this.gender;
	}
	
	/**
	 * Returns the phone number
	 */
	public String getPhoneNumber() {
		return this.telephone;
	}
	
	/**
	 * Returns true if data contains query
	 */
	public boolean containsData(String s) {
//		if (this.name.toLowerCase().startsWith(s) || this.name.equalsIgnoreCase(s))
//			return true;
//		
//		if (this.dateOfBirth.toLowerCase().startsWith(s) || this.dateOfBirth.equalsIgnoreCase(s))
//			return true;
//		
//		if (this.address.toLowerCase().startsWith(s) || this.address.equalsIgnoreCase(s))
//			return true;
//		
//		if (this.postcode.toLowerCase().startsWith(s) || this.postcode.equalsIgnoreCase(s))
//			return true;
//		
//		if (this.gender.toLowerCase().startsWith(s) || this.gender.equalsIgnoreCase(s))
//			return true;
//		
//		if (this.telephone.toLowerCase().startsWith(s) || this.telephone.equalsIgnoreCase(s))
//			return true;
		
		if (this.asCSVFormat().toLowerCase().contains(s.toLowerCase())) return true;
		
		return false;
	}
	
	/**
	 * Returns class in formatted way
	 */
	public String asString() {
		return StringUtils.formatString("Person[Name='{0}', DOB='{1}', Address='{2}', Postcode='{3}', Gender='{4}', Phone='{5}']", this.name, this.dateOfBirth, this.address, this.postcode, this.gender, this.telephone);
	}

	/**
	 * Returns the class and data in CSV format
	 */
	public String asCSVFormat() {
		return StringUtils.formatString("{0},{1},{2},{3},{4},{5}", this.name, this.dateOfBirth, this.address,this.postcode, this.gender, this.telephone);
	}
}