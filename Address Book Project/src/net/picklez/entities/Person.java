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
	
	public Person(String name, String dob, String address, String postcode, String gender, String tele) {
		this.name = name;
		this.dateOfBirth = dob;
		this.address= address;
		this.postcode = postcode;
		this.gender = gender;
		this.telephone = tele;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	 
	public void setDateOfBirth(String s) {
		this.dateOfBirth = s;
	}
	
	public void setAddress(String s) {
		this.address = s;
	}
	
	public void setPostcode(String s) {
		this.postcode = s;
	}
	
	public void setGender(String s) {
		this.gender = s;
	}
	
	public void setPhoneNumber(String s) {
		this.telephone = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getPostcode() {
		return this.postcode;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getPhoneNumber() {
		return this.telephone;
	}
	
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
	
	public String asString() {
		return StringUtils.formatString("Person[Name='{0}', DOB='{1}', Address='{2}', Postcode='{3}', Gender='{4}', Phone='{5}']", this.name, this.dateOfBirth, this.address, this.postcode, this.gender, this.telephone);
	}
	
	public String asCSVFormat() {
		return StringUtils.formatString("{0},{1},{2},{3},{4},{5}", this.name, this.dateOfBirth, this.address,this.postcode, this.gender, this.telephone);
	}
}