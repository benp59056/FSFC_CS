package net.picklez;

import java.util.Scanner;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.picklez.gui.PGui;
import net.picklez.managers.AddressBook;
import net.picklez.managers.CommandManager;
import net.picklez.managers.FileManager;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 14:56:53
 * Main class for application
 */

public class AppController {

	private FileManager fileManager;
	private AddressBook addressBook;
	private CommandManager commandManager;

	/**
	 * Performs required start-up method, then handles input received via console
	 */
	public AppController() {
		this.init();
		this.takeInput();
	}

	/**
	 * Begins application by instantiating current class
	 */
	public static void main(String[] args) {
		new AppController();
	}

	/**
	 * Creates an instance of the FileManager and creates an instance of
	 * the AddressBook class from the data kept in the file
	 */
	private void init() {
		this.log("Starting up application...");
		this.fileManager = new FileManager("C:\\Users\\CompUser\\Documents\\Address Book\\files\\book.csv");

		this.addressBook = this.fileManager.createBookFromFile();
		this.fileManager.createMeetingsManagerFromFile();
		this.log("Finished start-up");
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		new PGui();
	}

	/**
	 * Logging method to reduce time spent printing out debug-log-calls
	 * @param s - String to print
	 */
	private void log(String s) {
		System.out.println(s);
	}

	/**
	 * Takes the input constantly until program unexpectedly closes or user inputs
	 * 'exit' command
	 */
	private void takeInput() {
		this.commandManager = new CommandManager(this.addressBook);
		System.out.println("Please enter a command (use \"help\" to see all commands)");
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			try {
				this.commandManager.processInput(scanner);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("An error occurred; closing application");
			}
		}
		scanner.close();
	}
}