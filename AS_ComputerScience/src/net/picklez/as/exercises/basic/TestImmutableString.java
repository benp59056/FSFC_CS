package net.picklez.as.exercises.basic;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 13th Oct 2015
 */

public class TestImmutableString {

	public static void main(String[] args) {
		String firstName = "Joe";
		String lastName = "Bloggs";
		String s = new String("Joe");
		String s2 = new String("Joe");
		
		String orig = "pkaspakspaks";
		int startIndex = 0;
		int endIndex = 5;
		
		//Will return "Joe Bloggs"
		System.out.println(firstName + " " + lastName);
		
		//Will return false as values are not the same
		System.out.println(StringUtils.formatString("Does \"{0}\" .equal \"{1}\"? {2}", firstName, lastName, firstName.equals(lastName)));
		
		//Will return true as the values are the same and .equals is checking values, not references
		System.out.println(StringUtils.formatString("Does \"{0}\" .equal s? {1}", firstName, firstName.equals(s)));
		
		//Will return false as s is an object reference and is returning the reference, not the value
		System.out.println(StringUtils.formatString("Does \"{0}\" == s? {1}", firstName, firstName == s));
		
		//Will return false as they are both returning different references
		System.out.println(StringUtils.formatString("Does s == s2? {0}", s == s2));
		
		//Will return "pkasp" as it is the first five letters
		System.out.println(StringUtils.formatString("The substring of \"{0}\" from {1} to {2} = \"{3}\"", orig, startIndex, endIndex, orig.substring(startIndex, endIndex)));
	}
	
}
