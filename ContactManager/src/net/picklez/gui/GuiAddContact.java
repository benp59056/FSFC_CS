package net.picklez.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import net.picklez.AppController;
import net.picklez.entities.Contact;

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
public class GuiAddContact extends JFrame {
	
	private int tabIndex;
	
	public GuiAddContact() {
		setTitle("Add contact");
		this.setLocationRelativeTo(null);
		this.setSize(238, 418);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 11, 202, 14);
		getContentPane().add(lblNewLabel);
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setTabSize(0);
		textArea.setBounds(10, 31, 202, 22);
		getContentPane().add(textArea);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth");
		lblDateOfBirth.setBounds(10, 64, 202, 14);
		getContentPane().add(lblDateOfBirth);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setTabSize(0);
		textArea_1.setBounds(10, 84, 202, 22);
		getContentPane().add(textArea_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 117, 202, 14);
		getContentPane().add(lblAddress);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setTabSize(0);
		textArea_2.setBounds(10, 137, 202, 22);
		getContentPane().add(textArea_2);
		
		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(10, 170, 202, 14);
		getContentPane().add(lblPostcode);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setTabSize(0);
		textArea_3.setBounds(10, 190, 202, 22);
		getContentPane().add(textArea_3);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(10, 223, 202, 14);
		getContentPane().add(lblGender);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setTabSize(0);
		textArea_4.setBounds(10, 243, 202, 22);
		getContentPane().add(textArea_4);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone number");
		lblTelephoneNumber.setBounds(10, 276, 202, 14);
		getContentPane().add(lblTelephoneNumber);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setTabSize(0);
		textArea_5.setBounds(10, 296, 202, 22);
		getContentPane().add(textArea_5);
		
		JButton btnNewButton = new JButton("Add contact");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppController.getInstance().addContactToBook(new Contact(textArea.getText(), textArea_1.getText(), textArea_2.getText(), textArea_3.getText(), textArea_4.getText(), textArea_5.getText()));
				dispose();
			}
		});
		
		btnNewButton.setBounds(10, 329, 202, 40);
		getContentPane().add(btnNewButton);
		this.setVisible(true);
	}

	private static final long serialVersionUID = 1L;

}
