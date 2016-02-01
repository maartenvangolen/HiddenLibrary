package userInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class CryptoFace extends JPanel implements ActionListener {
	private JButton encrypt, decrypt;
	private JButton commandlineOn, commandlineOff;
	private JTextArea input, display;
	private JLabel commandLable, inputLable, displayLable, cryptLable, commandLable2;
	private CommandLine commandLine;
	private Garden garden;
	private TreeFace tree;

	public CryptoFace(Garden garden, TreeFace tree, CommandLine command) {
		this.garden = garden;
		this.tree = tree;
		commandLine = command;

		input = new JTextArea();
		input.setLineWrap(true);
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new BorderLayout());
		JScrollPane inputScrollPane = new JScrollPane(input);
		inputPanel.add(inputScrollPane, BorderLayout.CENTER);
		inputPanel.setPreferredSize(new Dimension(250, 100));

		display = new JTextArea();
		display.setEditable(false);
		display.setLineWrap(true);
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new BorderLayout());
		JScrollPane displayScrollPane = new JScrollPane(display);
		displayPanel.add(displayScrollPane, BorderLayout.CENTER);
		displayPanel.setPreferredSize(new Dimension(250, 100));

		encrypt = new JButton("Encrypt");
		decrypt = new JButton("Decrypt");
		commandlineOn = new JButton("ON");
		commandlineOff = new JButton("OFF");
		commandlineOff.setEnabled(false);

		encrypt.setPreferredSize(new Dimension(100, 25));
		decrypt.setPreferredSize(new Dimension(100, 25));

		decrypt.addActionListener(this);
		encrypt.addActionListener(this);
		commandlineOn.addActionListener(this);
		commandlineOff.addActionListener(this);

		commandLable = new JLabel("Commandline:");
		inputLable = new JLabel("Plain text:");
		displayLable = new JLabel("Cypther text:");
		cryptLable = new JLabel();
		commandLable2 = new JLabel();
		inputLable.setPreferredSize(new Dimension(75, 25));
		displayLable.setPreferredSize(new Dimension(75, 25));
		cryptLable.setPreferredSize(new Dimension(75, 25));
		commandLable.setPreferredSize(new Dimension(147, 25));
		commandLable2.setPreferredSize(new Dimension(64, 25));

		add(inputLable);
		add(inputPanel);
		add(displayLable);
		add(displayPanel);

		add(cryptLable);
		add(encrypt);
		add(decrypt);

		// add(branchSpace);
		add(commandLable);
		add(commandlineOn);
		add(commandlineOff);
		add(commandLable2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == encrypt) {
			tree.getSelected();
		}
		if (e.getSource() == decrypt) {
			tree.getSelected();
		}
		if (e.getSource() == commandlineOn) {
			activateCommandLine();
		}
		if (e.getSource() == commandlineOff) {
			commandlineOff.setEnabled(false);
			commandlineOn.setEnabled(true);

			commandLine.setVisible(false);
		}
	}

	public void activateCommandLine() {
		commandlineOff.setEnabled(true);
		commandlineOn.setEnabled(false);

		int x = (int) garden.getLocationOnScreen().getX();
		x = x + getWidth();
		int y = (int) garden.getLocationOnScreen().getY();
		commandLine.setLocation(x, y);
		commandLine.setVisible(true);
	}

}
