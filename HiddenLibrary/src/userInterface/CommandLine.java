package userInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CommandLine extends JFrame {
	private JTextArea commandPrompt;
	private ArrayList<String> allLines;

	public CommandLine() {
		allLines = new ArrayList<String>(30);

		setLayout(new FlowLayout());

		commandPrompt = new JTextArea();
		commandPrompt.setEditable(false);
		commandPrompt.setPreferredSize(new Dimension(250, 250));

		add(commandPrompt);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 200);
		setResizable(false);
	}

	public void addLine(String line) {
		int limit = 8;
		if (allLines.size() >= limit) {
			allLines.remove(0);
		}
		allLines.add(line);
		printLine();
	}

	public void printLine() {
		String printLines = "";
		for (String string : allLines) {
			printLines = printLines + "\n" + string;
		}
		commandPrompt.setText(printLines);
	}

	public static void main(String[] args) {
		CommandLine cm = new CommandLine();
	}
}
