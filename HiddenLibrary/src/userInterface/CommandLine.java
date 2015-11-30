package userInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CommandLine extends JFrame {
	private JTextArea commandPrompt;
	private ArrayList<String> line;

	public CommandLine() {
		line = new ArrayList<String>(30);
		
		setLayout(new FlowLayout());

		commandPrompt = new JTextArea();
		commandPrompt.setEditable(false);
		commandPrompt.setPreferredSize(new Dimension(250, 250));

		add(commandPrompt);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 200);
	}
	
	public void addLine(String line){
		
	}

	public static void main(String[] args) {
		CommandLine cm = new CommandLine();
	}
}
