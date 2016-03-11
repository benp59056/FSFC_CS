package net.picklez.as.exercises.challenge;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Ben Pickering
 * @since 8 Mar 2016 | 09:51:15
 */

public class ReactionFrame extends JFrame {

	private static final long serialVersionUID = -5518757254670798652L;
	private JPanel contentPane;

	private ArrayList<Reaction> reactions;
	private int numberReactions = 3;

	private JLabel label = new JLabel("Get ready...");
	private TextArea textArea;

	private long curReactionStart = 0;
	private long curReactionClick = 0;
	
	boolean reacting = false;

	/**
	 * Create the frame.
	 */
	public ReactionFrame() {
		super("Reaction test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.reactions = new ArrayList<Reaction>();

		JButton btnNewButton = new JButton("Click");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				buttonClicked();
			}
		});
		btnNewButton.setBounds(10, 11, 118, 42);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				

			}
		});
		contentPane.add(btnNewButton);

		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(148, 11, 129, 42);
		contentPane.add(label);

		textArea = new TextArea();
		textArea.setBounds(10, 67, 414, 185);
		contentPane.add(textArea);

		this.testReaction();
	}

	private void buttonClicked() {
		System.out.println("Clicked");
		if (curReactionClick == 0 && curReactionStart != 0 && reacting) {
			this.curReactionClick = System.currentTimeMillis();
			this.reactions.add(new Reaction(curReactionStart, curReactionClick));
			
			this.log((curReactionClick - curReactionStart) + "ms");
			
			reacting = false;


			label.setText("Get ready...");
			label.setForeground(Color.RED);
			curReactionClick = 0;
			curReactionStart = 0;
		}

	}
	
	public void log(String s) {
		this.textArea.setText(this.textArea.getText() + s + "\n");
	}

	private void testReaction() {
		for (int i = 1; i <= numberReactions; i++) {
			reacting = false;
			
			long l  = (long) (System.currentTimeMillis() + 2000 + (Math.random() * 1000));

			while (System.currentTimeMillis() < l) {
				continue;
			}
			
			System.out.println("Changed");
			label.setText("Click");
			label.setForeground(Color.GREEN);

			reacting = true;
			curReactionStart = System.currentTimeMillis();
			

			while (reacting) {
				System.out.println("Waiting...");
			}
			
			if (i == numberReactions) {
				label.setText("Done");
				label.setForeground(Color.CYAN);
			}
		}
		
		
		long time = 0;
		
		for (Reaction r : this.reactions) {
			time += r.getReactionTime();
		}
		
		long avg = time / this.numberReactions;
		
		this.log("Average reaction time: " + avg + "ms");
	}
}
