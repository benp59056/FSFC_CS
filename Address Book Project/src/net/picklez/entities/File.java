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
 */
public class File {

	private ArrayList<String> lines;
	private String filePath;

	public File(String s) {
		this.filePath = s;
		this.lines = new ArrayList<String>(); 
		this.loadContent();
	}

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
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Failed to read file");
		}
	}
	
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

	public ArrayList<String> getLines() {
		return this.lines;
	}
}