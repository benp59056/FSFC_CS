package net.picklez.utils.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:06:40
 * Description: Custom file object 
*/
public class PFile {

	private String filePath;
	private ArrayList<String> lines;
	
	/**
	 * Creates instance with file path 
	 */
	public PFile(String s) {
		this.lines = new ArrayList<String>();
		this.filePath = s;
	}

	/**
	 * Reads through the file and loads lines into arraylist
	 */
	public void loadContent() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(this.filePath));
			String line;
			
			while ((line = reader.readLine()) != null) {
				if (!line.trim().startsWith("//")) {
					this.lines.add(line);
				}
			}
			
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("Could not find file: " + this.filePath);
		} catch (IOException e) {
			System.err.println("An IO Exception occurred on file: " + this.filePath);
		}
	}
	
	/**
	 * Overrides file with parameter 
	 */
	public void writeToFile(String s) {
		try {
			PrintWriter printWriter = new PrintWriter(new File(this.filePath));
			printWriter.print("");
			printWriter.print(s);
			printWriter.close();
		} catch (FileNotFoundException e) {
			System.err.println("Failed to write over file");
		}
	}
	
	/**
	 * Overrides the file with no content
	 */
	public void cleanFile() {
		try {
			PrintWriter printWriter = new PrintWriter(new File(this.filePath));
			printWriter.print("");
			printWriter.close();
		} catch (FileNotFoundException e) {
			System.err.println("Failed to write over file");
		}
	}
	
	/**
	 * Returns the file path
	 */
	public String getFilePath() {
		return this.filePath;
	}
	
	/**
	 * Returns the arraylist of lines (content)
	 */
	public ArrayList<String> getLines() {
		return this.lines;
	}
}