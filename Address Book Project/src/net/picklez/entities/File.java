package net.picklez.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 1 Dec 2015 | 15:31:48
 * Custom File class to hold file contents and its path
 */
public class File {

	private ArrayList<String> lines;
	private String filePath;

	/**
	 * Loads content of file with path s
	 */
	public File(String s) {
		this.filePath = s;
		this.lines = new ArrayList<String>(); 
		this.loadContent();
	}

	/**
	 * Loads the content of the file into an arraylist of lines
	 */
	private void loadContent() {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(this.filePath));
			String curLine = bufferedReader.readLine();

			while (curLine != null) {
				this.lines.add(curLine);
				curLine = bufferedReader.readLine();
			}

			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Couldn't find address book, creating one now!");
			java.io.File file = new java.io.File(this.filePath);
			try {
				file.getParentFile().mkdirs();
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("Failed to create file");
				System.exit(0);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failed to read file");
			System.exit(0);
		}
	}
	
	/**
	 * Writes over contents of current file with parameter s
	 * @param s
	 */
	public void writeOverFile(String s) {
		try {
			PrintWriter printWriter = new PrintWriter(new java.io.File(this.filePath));
			printWriter.print("");
			printWriter.print(s);
			printWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("Failed to write over file");
			e.printStackTrace();
		}
	}

	/**
	 * Returns the lines of the file as an arraylist
	 */
	public ArrayList<String> getLines() {
		return this.lines;
	}
}