package net.picklez.utils.collections;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:16:10
 * A basic LinkedList class
 */

public class PLinkedList {

	private PLink first;

	public PLinkedList() {
		this.first = null;
	}
	
	/**
	 * Returns whether list is empty or not
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return first == null;
	}
	
	/**
	 * Will insert parameter into front of list
	 * @param link - new link to insert
	 */
	public void insertFirst(PLink link) {
		if (this.first != null)
			link.setNextLink(this.first);
		
		this.first = link;
	}
	
	/**
	 * Will return the first link in the list
	 * @return PLink - first link in list
	 */
	public PLink getFirst() {
		return this.first;
	}
	
	/**
	 * Will insert parameter at the end of the list
	 * @param o - content to be added to the list
	 */
	public void insertLast(Object o) {
		PLink link = new PLink(o);
		
		if (this.first == null)
			this.first = link;
		else {
			PLink current = this.first;
			while (current != null) {
				if (current.getNextLink() == null) {
					current.setNextLink(link);
					current = null;
				} else 
					current = current.getNextLink();
			}
		}
	}
	
	/**
	 * Will insert parameter at the front of the list
	 * @param o - content to be added to the list
	 */
	public void insertFirst(Object o) {
		PLink link = new PLink(o);
		
		if (this.first != null)
			link.setNextLink(this.first);
		
		this.first = link;
	}
	
	/**
	 * Deletes the first link in the list
	 * @return PLink - instance of the deleted link
	 */
	public PLink deleteFirst() {
		PLink toDelete = this.first;
		this.first = toDelete.getNextLink();
		return toDelete;
	}
	
	/**
	 * Inserts second parameter after first
	 * @param first -- the original link in list
	 * @param last -- the new link to be added to list
	 */
	public void insertAfter(PLink first, PLink last) {
		PLink current = first;
		while (current != null) {
			if (current.equals(first)) {
				current.insertAfter(last);
				current = null;
				break;
			}
			current = current.getNextLink();
		}
	}
	
	/**
	 * Searches for link in list
	 * @param link - link to find
	 * @return - instance of link if found, null if not
	 */
	public PLink findLink(PLink link) {
		PLink current = first;
		while (current != null) {
			if (current.equals(link))
				return current;
			current = current.getNextLink();
		}
		return null;
	}
	
	/**
	 * Prints out the list in a formatted manner
	 */
	public void displayList() {
		System.out.println("List (first-> last): ");
		PLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.getNextLink();
		}
		System.out.println(" ");
	}

	/**
	 * Removes the specified link from list
	 * @param link - link to be removed from list
	 * @return - true if was removed, false if not
	 */
	public boolean remove(PLink link) {
		PLink current = first;
		while (current != null) {
			if (current.getNextLink().equals(link)) {
				current.setNextLink(link.getNextLink());
				return true;
			}
			current = current.getNextLink();
		}
		return false;
	}

	/**
	 * Shows if list has a first element
	 * @return - false if empty
	 */
	public boolean hasFirst() {
		return this.first != null;
	}
	
}