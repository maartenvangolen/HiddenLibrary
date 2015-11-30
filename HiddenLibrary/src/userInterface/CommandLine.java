package userInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CommandLine extends JFrame {
	private JTextArea commandPrompt;

	public CommandLine() {
		setLayout(new FlowLayout());

		commandPrompt = new JTextArea();
		commandPrompt.setEditable(false);
		commandPrompt.setPreferredSize(new Dimension(250,250));

		add(commandPrompt);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 200);
	}

	public static void main(String[] args) {
		CommandLine cm = new CommandLine();
	}
}
