package net.picklez.utils.collections;

/**
 * @author Ben Pickering
 * @since 27 Nov 2015 | 13:16:10
 */

public class PLinkedList {

	private PLink first;
	
	public PLinkedList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(PLink link) {
		if (this.first != null)
			link.setNextLink(this.first);
		
		this.first = link;
	}
	
	public PLink getFirst() {
		return this.first;
	}
	
	public void insertFirst(Object o) {
		PLink link = new PLink(o);
		
		if (this.first != null)
			link.setNextLink(this.first);
		
		this.first = link;
	}
	
	public PLink deleteFirst() {
		PLink toDelete = this.first;
		this.first = toDelete.getNextLink();
		return toDelete;
	}
	
	/**
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
	
	public PLink findLink(PLink link) {
		PLink current = first;
		while (current != null) {
			if (current.equals(link))
				return current;
			current = current.getNextLink();
		}
		return null;
	}
	
	public void displayList() {
		System.out.println("List (first-> last): ");
		PLink current = first;
		while (current != null) {
			current.displayLink();
			current = current.getNextLink();
		}
		System.out.println(" ");
	}

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

	public boolean hasFirst() {
		return this.first != null;
	}
	
}