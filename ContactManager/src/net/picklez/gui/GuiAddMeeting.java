package net.picklez.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import net.picklez.AppController;
import net.picklez.entities.Contact;
import net.picklez.entities.Meeting;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 17:23:00
 * Description: Gui for adding a contact
*/
public class GuiAddMeeting extends JFrame {
	
	private int tabIndex;
	
	public GuiAddMeeting() {
		setTitle("Add meeting");
		this.setLocationRelativeTo(null);
		this.setSize(238, 316);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Topic");
		lblNewLabel.setBounds(10, 11, 202, 14);
		getContentPane().add(lblNewLabel);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setTabSize(0);
		textArea.setBounds(10, 31, 202, 22);
		getContentPane().add(textArea);
		
		JLabel lblDateOfBirth = new JLabel("ID");
		lblDateOfBirth.setBounds(10, 64, 202, 14);
		getContentPane().add(lblDateOfBirth);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setTabSize(0);
		textArea_1.setBounds(10, 84, 202, 22);
		getContentPane().add(textArea_1);
		
		JLabel lblAddress = new JLabel("Date (dd/mm/yyyy)");
		lblAddress.setBounds(10, 117, 202, 14);
		getContentPane().add(lblAddress);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setTabSize(0);
		textArea_2.setBounds(10, 137, 202, 22);
		getContentPane().add(textArea_2);
		
		JLabel lblPostcode = new JLabel("Members (separate with commas)");
		lblPostcode.setBounds(10, 170, 202, 14);
		getContentPane().add(lblPostcode);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setTabSize(0);
		textArea_3.setBounds(10, 190, 202, 22);
		getContentPane().add(textArea_3);
		
		JButton btnNewButton = new JButton("Add meeting");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppController.getInstance().addMeetingToBook(new Meeting(textArea.getText(), textArea_1.getText(), textArea_2.getText(), textArea_3.getText()));
				dispose();
			}
		});
		
		btnNewButton.setBounds(10, 223, 202, 40);
		getContentPane().add(btnNewButton);
		this.setVisible(true);
	}

	private static final long serialVersionUID = 1L;

}
