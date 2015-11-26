package net.picklez.as.exercises.linkedlists;

/**
 * @author Ben Pickering
 * @since 26 Nov 2015 | 11:12:48
 */

public class LalinLinkedList {

	private LalinLink first;
	
	public LalinLinkedList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(LalinLink link) {
		if (this.first != null)
			link.setNextLink(this.first);
		
		this.first = link;
	}
	
	public void insertFirst(String name, int age, String favBand, boolean inRelationship) {
		LalinLink link = new LalinLink(name, age, favBand, inRelationship);
		
		if (this.first != null)
			link.setNextLink(this.first);
		
		this.first = link;
	}
	
	public LalinLink deleteFirst() {
		LalinLink toDelete = this.first;
		this.first = toDelete.getNextLink();
		return toDelete;
	}
	
	public void insertAfter(LalinLink first, LalinLink last) {
		LalinLink current = first;
		while (current != null) {
			if (current.equals(first)) {
				current.insertAfter(last);
				current = null;
				break;
			}
			current = current.getNextLink();
		}
	}
	
	public void displayList() {
		System.out.print("List (first-> last): ");
		LalinLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.getNextLink();
		}
		System.out.println(" ");
	}
}