package net.picklez;

import java.util.Scanner;

import net.picklez.managers.AddressBook;
import net.picklez.managers.CommandManager;
import net.picklez.managers.FileManager;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 14:56:53
 */

public class AppController {

	private FileManager fileManager;
	private AddressBook addressBook;
	private CommandManager commandManager;

	public AppController() {
		this.init();
		this.takeInput();
	}

	public static void main(String[] args) {
		new AppController();
	}

	private void init() {
		this.log("Starting up application...");
		this.fileManager = new FileManager("C:\\Users\\CompUser\\My Documents\\bookAsCSV.csv");

		this.addressBook = this.fileManager.createBookFromFile();
		this.log("Finished start-up");
	}

	private void log(String s) {
		System.out.println(s);
	}

	private void takeInput() {
		this.commandManager = new CommandManager(this.addressBook);
		System.out.println("Please enter a command (use \"help\" if you have no idea)");
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			try {
				this.commandManager.processInput(scanner);
			} catch (Exception e) {

			}
		}
		scanner.close();
	}
}