package net.picklez;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.picklez.collections.AddressBook;
import net.picklez.collections.MeetingBook;
import net.picklez.entities.Contact;
import net.picklez.entities.Meeting;
import net.picklez.gui.GuiFrame;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:04:47
 * Description: The entry point and main-class of the application
*/
public class AppController {

	private AddressBook book;
	private MeetingBook meetingsBook;
	
	private GuiFrame guiFrame;
	
	private static AppController appControllerInstance;
	
	public static final String DOC_PATH = System.getenv("APPDATA") + "\\Contact Manager\\";
	
	public AppController() {
		appControllerInstance = this;
		this.init();
	}
	
	/**
	 * Entry point to application
	 */
	public static void main(String[] args) {
		new AppController();
	}
	
	/**
	 * Creates Address Book and Meeting Book from files
	 */
	private void init() {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		this.book = new AddressBook(DOC_PATH + "contacts");
		this.meetingsBook = new MeetingBook(DOC_PATH  + "meetings");
		
		this.book.populate();
		this.meetingsBook.populate();
		
		this.book.printBook();
		this.meetingsBook.printBook();
		
		guiFrame = new GuiFrame();
		guiFrame.populateContacts(this.book);
		guiFrame.populateMeetings(this.meetingsBook);
	}
	
	/**
	 * Returns the instance of the address book
	 */
	public AddressBook getAddressBook() {
		return this.book;
	}
	
	public MeetingBook getMeetingBook() {
		return this.meetingsBook;
	}
	
	public void addContactToBook(Contact c) {
		this.book.addContact(c);
		guiFrame.populateContacts(this.book);
	}
	
	public static AppController getInstance() {
		return appControllerInstance;
	}

	public void addMeetingToBook(Meeting meeting) {
		this.meetingsBook.addMeeting(meeting);
		guiFrame.populateMeetings(meetingsBook);
	}
	
}