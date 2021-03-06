package net.picklez.utils.collections;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:16:46
 * An object to be emulate a link in a LinkedList (PLinkedList)
 */

public class PLink {
	
	private Object content;

	private PLink nextLink = null;
	private PLink previousLink = null;

	/**
	 * Sets the content of the link
	 * @param o - content that link should contain
	 */
	public PLink(Object o) {
		this.content = o;
	}
	
	/**
	 * Sets the content of the link
	 * @param o - content that link should contain
	 * @param prev - previous link -- used for latter insertion
	 */
	public PLink(Object o, PLink prev) {
		this.content = o;
		this.previousLink = prev;
	}
	
	/**
	 * Will print Link in format of asString method
	 * @see asString()
	 */
	public void displayLink() {
		System.out.println(this.asString());
	}
	
	/**
	 * Inserts a link after current one
	 * @param link - link to insert after current link
	 */
	public void insertAfter(PLink link) {
		link.setNextLink(nextLink);
		this.setNextLink(link);
	}
	
	/**
	 * Sets the next link in list
	 * @param link - the link to be connected
	 */
	public void setNextLink(PLink link) {
		this.nextLink = link;
	}
	
	/**
	 * Sets the previous link in list
	 * @param link - the link to be connected before
	 */
	public void setPrevLink(PLink link) {
		this.previousLink = link;
	}
	
	/**
	 * Returns the next link in the list
	 * @return PLink - next link in list
	 */
	public PLink getNextLink() {
		return this.nextLink;
	}

	/**
	 * States if link is connected to another link
	 * @return false if has no next link
	 */
	public boolean hasNextLink() {
		return this.nextLink != null;
	}
	
	/**
	 * Returns the prvious link in the list
	 * @return PLink - previous link in list
	 */ 
	public PLink getPreviousLink() {
		return this.previousLink;
	}
	
	/**
	 * Returns instance of PLink in format "PLink[Content]"
	 * @return instance as a String
	 */
	public String asString() {
		String result = StringUtils.formatString("PLink[Content='{0}']", this.content);
		return result;
	}
	
}