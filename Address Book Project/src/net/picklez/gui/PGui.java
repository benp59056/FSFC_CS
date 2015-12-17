package net.picklez.gui;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JDesktopPane;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 * @author Ben Pickering
 * @since 16 Dec 2015 | 19:18:21
 * Description: Gui using JTattoo 
 */
public class PGui extends JFrame {

	public PGui() {
		super("Contact Manager");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);


		JPanel splashPanel = new JPanel();
		JPanel contactsPanel = new JPanel();
		JPanel meetingsPanel = new JPanel();
		JPanel settingsPanel = new JPanel();
		JPanel devPanel = new JPanel();


		JTabbedPane tabbedPane = new JTabbedPane();
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
		labelVersion.setBounds(32, 120, 337, 61);
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
		changeLogLabel.setBounds(32, 203, 337, 61);
		splashPanel.add(changeLogLabel);
		tabbedPane.add("Contacts", contactsPanel);
		tabbedPane.add("Meetings", meetingsPanel);
		tabbedPane.add("Settings", settingsPanel);
		settingsPanel.setLayout(null);


		String[] themes = { "HiFi", "Noire", "Mac&Win", "Graphite" };

		JComboBox<String> comboBox = new JComboBox(themes);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {

				if (event.getStateChange() == ItemEvent.SELECTED) {
					System.out.println("Combo box selection changed");

					try {
						switch (comboBox.getSelectedItem().toString()) {
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
		comboBox.setBounds(10, 27, 139, 20);

		settingsPanel.add(comboBox);

		JLabel lblTheme = new JLabel("Theme");
		lblTheme.setBounds(10, 11, 46, 14);
		settingsPanel.add(lblTheme);
		tabbedPane.add("Development", devPanel);
		getContentPane().add(tabbedPane);

		this.setVisible(true);
	}
}