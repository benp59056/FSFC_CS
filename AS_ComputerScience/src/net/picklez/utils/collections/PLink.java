package net.picklez.utils.collections;

import net.picklez.utils.StringUtils;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:16:46
 */

public class PLink {
	
	private Object content;

	private PLink nextLink = null;
	private PLink previousLink = null;
	
	public PLink(Object o) {
		this.content = o;
	}
	
	public PLink(Object o, PLink prev) {
		this.content = o;
		this.previousLink = prev;
	}
	
	public void displayLink() {
		System.out.println(this.asString());
	}
	
	public void insertAfter(PLink link) {
		link.setNextLink(nextLink);
		this.setNextLink(link);
	}
	
	public void setNextLink(PLink link) {
		this.nextLink = link;
	}
	
	public void setPrevLink(PLink link) {
		this.previousLink = link;
	}
	
	public PLink getNextLink() {
		return this.nextLink;
	}

	public boolean hasNextLink() {
		return this.nextLink != null;
	}
	
	public PLink getPreviousLink() {
		return this.previousLink;
	}
	
	public String asString() {
		String result = StringUtils.formatString("PLink[Content='{0}']", this.content);
		return result;
	}
	
}