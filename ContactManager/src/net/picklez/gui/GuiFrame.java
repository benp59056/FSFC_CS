package net.picklez.gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import net.picklez.collections.AddressBook;
import net.picklez.collections.MeetingBook;
import net.picklez.entities.Contact;
import net.picklez.entities.Meeting;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Properties;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:12:20
 * Description: Gui for project
 */
public class GuiFrame  extends JFrame {
	private static final long serialVersionUID = -6554420170923403600L;

	private static GuiFrame currentInstance;

	private GuiAddContact addContactPanel;
	private GuiAddMeeting addMeetingPanel;
	
	private JPanel splashPanel;
	private JPanel meetingsPanel;
	private JPanel settingsPanel;
	private JPanel devPanel;
	private JPanel contactsPanel;

	private JTable contactDataTable;
	private JList contactsList;
	private JTextField searchContactsTextField;
	private JList searchedContactsList;

	private JTable meetingDataTable;
	private JList meetingsList;
	private JList searchedMeetingsList;
	private JTextField searchMeetingsTextField;

	private static String logString = "";

	private Contact focusedContact;
	private Meeting focusedMeeting;
	
	private static JTextPane logTextPane;

	public static final String FILE_PATH = System.getenv("APPDATA") + "\\Contact Manager\\";

	private AddressBook addressBook;
	private MeetingBook meetingBook;

	public GuiFrame() {
		super("Contact Manager - Ben Pickering");
		this.setResizable(false);
		this.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) {
				setSize(400, 418);
			}
		});

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(400, 418);
		this.setLocationRelativeTo(null);

		splashPanel = new JPanel();
		meetingsPanel = new JPanel();
		settingsPanel = new JPanel();
		devPanel = new JPanel();
		contactsPanel = new JPanel();

		JTabbedPane tabbedPane = new JTabbedPane();

		/**********************************************************************************************************************/
		/******************************************* SPLASH ******************************************************************/
		/*********************************************************************************************************************/

		tabbedPane.add("Splash", splashPanel);
		splashPanel.setLayout(null);

		JLabel titleLabel = new JLabel("Contact Manager");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Verdana", Font.PLAIN, 38));
		titleLabel.setBounds(10, 11, 359, 82);
		splashPanel.add(titleLabel);

		JLabel authorLabel = new JLabel("By Ben Pickering");
		authorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		authorLabel.setFont(new Font("Verdana", Font.ITALIC, 18));
		authorLabel.setBounds(120, 49, 303, 82);

		splashPanel.add(authorLabel);

		JLabel labelVersion = new JLabel("Version: 1");
		labelVersion.setHorizontalAlignment(SwingConstants.LEFT);
		labelVersion.setFont(new Font("Verdana", Font.PLAIN, 18));
		labelVersion.setBounds(32, 124, 337, 61);
		splashPanel.add(labelVersion);

		JLabel githubLabel = new JLabel("Github: http://github.com/benp59056");
		githubLabel.setToolTipText("http://github.com/benp59056");
		githubLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Desktop.getDesktop().browse(new URI("http://github.com/benp59056"));
				} catch (IOException e) {
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
			}
		});
		githubLabel.setHorizontalAlignment(SwingConstants.LEFT);
		githubLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		githubLabel.setBounds(32, 158, 337, 61);
		splashPanel.add(githubLabel);

		JLabel changeLogLabel = new JLabel("Changelog:");
		changeLogLabel.setToolTipText("");
		changeLogLabel.setHorizontalAlignment(SwingConstants.LEFT);
		changeLogLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		changeLogLabel.setBounds(32, 192, 337, 61);
		splashPanel.add(changeLogLabel);

		JLabel authorLabel2 = new JLabel("& Sam Malcolm");
		authorLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		authorLabel2.setFont(new Font("Verdana", Font.ITALIC, 18));
		authorLabel2.setBounds(120, 70, 313, 82);
		splashPanel.add(authorLabel2);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 124, 409, 23);
		splashPanel.add(separator);

		JTextPane changeLogPane = new JTextPane();
		changeLogPane.setForeground(SystemColor.menuText);
		changeLogPane.setEditable(false);
		changeLogPane.setBackground(SystemColor.menu);
		changeLogPane.setText("* Added new gui\r\n* Added Levenshtein distance to assist incorrect commands in console\r\n* Fixed parsing errors\r\n* Made software more user-friendly");
		changeLogPane.setBounds(32, 238, 337, 103);
		splashPanel.add(changeLogPane);

		/**********************************************************************************************************************/
		/******************************************* CONTACTS ****************************************************************/
		/*********************************************************************************************************************/

		String[] contacts = { "Contact #1", "Contact #2", "Contact #3" };

		DefaultTableModel tableModel = new DefaultTableModel();
		tabbedPane.add("Contacts", contactsPanel);
		contactsPanel.setLayout(null);

		contactsList = new JList(contacts);
		contactsList.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contactsList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				//Calls twice per change
				try {
					Contact c = addressBook.getContactFromName(contactsList.getSelectedValue().toString());
					contactDataTable.setModel(new DefaultTableModel(
							new Object[][] {
								{"Name", c.getName()},
								{"DoB", c.getDateOfBirth()},
								{"Address", c.getAddress()},
								{"Postcode", c.getPostcode()},
								{"Gender", c.getGender()},
								{"Telephone", c.getPhoneNumber()},
							},
							new String[] {
									"", ""
							}
							));
					
					focusedContact = c;
				} catch (Exception e) {
				}
			}});
		contactsList.setBounds(10, 11, 167, 131);
		contactsPanel.add(contactsList);

		contactDataTable = new JTable();
		contactDataTable.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contactDataTable.setFillsViewportHeight(true);
		contactDataTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		contactDataTable.setBounds(187, 12, 182, 130);
		contactDataTable.setModel(new DefaultTableModel(
				new Object[][] {
					{"Name", null},
					{"DoB", null},
					{"Address", null},
					{"Postcode", null},
					{"Gender", null},
					{"Telephone", null},
				},
				new String[] {
						"", ""
				}
				));

		contactsPanel.add(contactDataTable);

		JButton editContactButton = new JButton("Apply changes");
		editContactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				focusedContact.setName(contactDataTable.getValueAt(0, 1).toString());
				focusedContact.setDateOfBirth(contactDataTable.getValueAt(1, 1).toString());
				focusedContact.setAddress(contactDataTable.getValueAt(2, 1).toString());
				focusedContact.setPostcode(contactDataTable.getValueAt(3, 1).toString());
				focusedContact.setGender(contactDataTable.getValueAt(4, 1).toString());
				focusedContact.setPhoneNumber(contactDataTable.getValueAt(5, 1).toString());
				addressBook.replaceContact(addressBook.getContactFromName(contactsList.getSelectedValue().toString()), focusedContact);
				populateContacts(addressBook);
			}
		});
		editContactButton.setBounds(262, 153, 107, 30);
		contactsPanel.add(editContactButton);

		JButton removeContactButton = new JButton("Remove contact");
		removeContactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log("Removing selected contact");
				Contact c = addressBook.getContactFromName(contactsList.getSelectedValue().toString());
				addressBook.removeContact(c);
				populateContacts(addressBook);
			}
		});
		removeContactButton.setBounds(135, 153, 117, 30);
		contactsPanel.add(removeContactButton);

		JButton addContactButton = new JButton("Add contact");
		addContactButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				log("Adding contact");
				addContactPanel = new GuiAddContact();
			}
		});
		addContactButton.setBounds(10, 153, 117, 30);
		contactsPanel.add(addContactButton);

		searchContactsTextField = new JTextField();
		searchContactsTextField.setBounds(10, 221, 167, 20);
		contactsPanel.add(searchContactsTextField);
		searchContactsTextField.setColumns(10);

		JLabel searchContactsLabel = new JLabel("Search contacts");
		searchContactsLabel.setBounds(10, 205, 167, 14);
		contactsPanel.add(searchContactsLabel);

		searchedContactsList = new JList();
		searchedContactsList.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		searchedContactsList.setBounds(10, 252, 369, 84);
		contactsPanel.add(searchedContactsList);

		JButton searchContactsButton = new JButton("...");
		searchContactsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Contact> contacts = new ArrayList<Contact>();
				for (Contact c : addressBook.getContacts()) {
					if (c.containsData(searchContactsTextField.getText())) {
						contacts.add(c);
					}
				}
				if (contacts.size() > 0)
					populateContactSearch(contacts);
			}
		});
		searchContactsButton.setBounds(180, 221, 27, 20);
		contactsPanel.add(searchContactsButton);

		/**********************************************************************************************************************/
		/******************************************* MEETINGS ****************************************************************/
		/*********************************************************************************************************************/

		tabbedPane.add("Meetings", meetingsPanel);
		String[] meetings = { "Meeting #1", "Meeting #2", "Meeting #3" };

		DefaultTableModel meetingsTableModel = new DefaultTableModel();
		meetingsPanel.setLayout(null);

		meetingsList = new JList(meetings);
		meetingsList.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		meetingsList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				try {
					Meeting m = meetingBook.getMeetingFromTopic(meetingsList.getSelectedValue().toString());
					meetingDataTable.setModel(new DefaultTableModel(
							new Object[][] {
								{"Topic", m.getTopic()},
								{"ID", m.getID()},
								{"Date", m.getDateAsString()},
								{"Members", m.getContactsAsString()},
							},
							new String[] {
									"", ""
							}
							));
					
					focusedMeeting = m;
				} catch (Exception e) {
				}
			}
		});
		meetingsList.setBounds(10, 11, 167, 131);
		meetingsPanel.add(meetingsList);

		meetingDataTable = new JTable();
		meetingDataTable.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		meetingDataTable.setFillsViewportHeight(true);
		meetingDataTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		meetingDataTable.setBounds(187, 12, 182, 130);
		meetingDataTable.setModel(new DefaultTableModel(
				new Object[][] {
					{"Topic", null},
					{"ID", null},
					{"Date", null},
					{"Members", null},
				},
				new String[] {
						"", ""
				}
				));

		meetingsPanel.add(meetingDataTable);

		JButton editMeetingButton = new JButton("Apply changes");
		editMeetingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log("apply changes");
			}
		});
		editMeetingButton.setBounds(262, 153, 107, 30);
		meetingsPanel.add(editMeetingButton);

		JButton removeMeetingButton = new JButton("Remove meeting");
		removeMeetingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log("remove meeting");
				Meeting m = meetingBook.getMeetingFromTopic(meetingsList.getSelectedValue().toString());
				meetingBook.removeMeeting(m);
				populateMeetings(meetingBook);
			}
		});
		removeMeetingButton.setBounds(135, 153, 117, 30);
		meetingsPanel.add(removeMeetingButton);

		JButton addMeetingButton = new JButton("Add meeting");
		addMeetingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				log("adding meeting");
				addMeetingPanel = new GuiAddMeeting();
				
			}
		});
		addMeetingButton.setBounds(10, 153, 117, 30);
		meetingsPanel.add(addMeetingButton);

		searchMeetingsTextField = new JTextField();
		searchMeetingsTextField.setBounds(10, 221, 167, 20);
		meetingsPanel.add(searchMeetingsTextField);
		searchMeetingsTextField.setColumns(10);

		JLabel searchMeetingsLabel = new JLabel("Search meetings");
		searchMeetingsLabel.setBounds(10, 205, 167, 14);
		meetingsPanel.add(searchMeetingsLabel);

		searchedMeetingsList = new JList();
		searchedMeetingsList.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		searchedMeetingsList.setBounds(10, 252, 369, 84);
		meetingsPanel.add(searchedMeetingsList);

		JButton searchMeetingsButton = new JButton("...");
		searchMeetingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Meeting> meetings = new ArrayList<Meeting>();
				for (Meeting m : meetingBook.getMeetings()) {
					if (m.containsData(searchMeetingsTextField.getText())) {
						meetings.add(m);
					}
				}
				if (meetings.size() > 0)
					populateMeetingSearch(meetings);
			}
		});
		searchMeetingsButton.setBounds(180, 221, 27, 20);
		meetingsPanel.add(searchMeetingsButton);

		/**********************************************************************************************************************/
		/******************************************* SETTINGS ****************************************************************/
		/*********************************************************************************************************************/

		tabbedPane.add("Settings", settingsPanel);
		settingsPanel.setLayout(null);


		String[] themes = { "Graphite", "HiFi", "Noire", "Mac&Win" };

		JComboBox<String> themeComboBox = new JComboBox(themes);
		themeComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {

				if (event.getStateChange() == ItemEvent.SELECTED) {

					try {
						switch (themeComboBox.getSelectedItem().toString()) {
						case "HiFi":
							com.jtattoo.plaf.hifi.HiFiLookAndFeel.setCurrentTheme(new Properties());
							UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
							break;
						case "Noire":
							com.jtattoo.plaf.noire.NoireLookAndFeel.setCurrentTheme(new Properties());
							UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
							break;
						case "Mac&Win":
							com.jtattoo.plaf.mcwin.McWinLookAndFeel.setCurrentTheme(new Properties());
							UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
							break;
						case "Graphite":
							com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setCurrentTheme(new Properties());
							UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
							break;
						}

						Window windows[] = Window.getWindows();
						for (Window window : windows) {
							if (window.isDisplayable()) {
								SwingUtilities.updateComponentTreeUI(window);
							}
						}

					} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
							| UnsupportedLookAndFeelException e) {
						e.printStackTrace();
					}
				}

			}
		});
		themeComboBox.setBounds(10, 27, 139, 20);

		settingsPanel.add(themeComboBox);

		JLabel themeLabel = new JLabel("Theme");
		themeLabel.setBounds(10, 11, 46, 14);
		settingsPanel.add(themeLabel);

		JCheckBox alwaysOnTopCheckBox = new JCheckBox("Always on top");
		alwaysOnTopCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setAlwaysOnTop(alwaysOnTopCheckBox.isSelected());
			}
		});
		alwaysOnTopCheckBox.setBounds(6, 54, 143, 23);
		settingsPanel.add(alwaysOnTopCheckBox);

		JTextField defaultFilePathTextField = new JTextField();
		defaultFilePathTextField.setBounds(10, 111, 169, 20);
		defaultFilePathTextField.setText(FILE_PATH);
		settingsPanel.add(defaultFilePathTextField);
		defaultFilePathTextField.setColumns(10);

		JLabel defaultFilePathLabel = new JLabel("Default file path");
		defaultFilePathLabel.setBounds(10, 96, 169, 14);
		settingsPanel.add(defaultFilePathLabel);

		/**********************************************************************************************************************/
		/******************************************* DEVELOPMENT *************************************************************/
		/*********************************************************************************************************************/

		tabbedPane.add("Development", devPanel);
		devPanel.setLayout(null);

		JLabel lblLog = new JLabel("Log");
		lblLog.setBounds(10, 11, 46, 14);
		devPanel.add(lblLog);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 369, 315);
		devPanel.add(scrollPane);

		logTextPane = new JTextPane();
		logTextPane.setEditable(false);
		scrollPane.setViewportView(logTextPane);
		getContentPane().add(tabbedPane);

		this.setVisible(true);
		this.postCreation();
	}

	private void postCreation() {
		log("Gui loaded");
		log("Post creation running...");
	}

	public void populateContacts(AddressBook add) {
		this.addressBook = add;
		String[] contacts = add.getContactsAsStringArray();
		DefaultListModel model = new DefaultListModel();
		for (String s : contacts)
			model.addElement(s);
		contactsList.setModel(model);
	}
	
	public void populateContactSearch(ArrayList<Contact> contacts) {
		DefaultListModel model = new DefaultListModel();
		for (Contact c : contacts)
			model.addElement(c.asString());
		searchedContactsList.setModel(model);
	}

	public void populateMeetings(MeetingBook meet) {
		this.meetingBook = meet;
		String[] meetings = meet.getMeetingsAsStringArray();
		DefaultListModel model = new DefaultListModel();
		for (String s : meetings)
			model.addElement(s);
		meetingsList.setModel(model);
	}
	
	public void populateMeetingSearch(ArrayList<Meeting> meetings) {
		DefaultListModel model = new DefaultListModel();
		for (Meeting m : meetings)
			model.addElement(m.asString());
		searchedMeetingsList.setModel(model);
	}

	public static String getCurrentTheme() {
		return UIManager.getLookAndFeel().toString();
	}
	
	public static void log(String s) {
		logString += s + "\n";
		if (logTextPane != null)
			logTextPane.setText(logString);
	}
}