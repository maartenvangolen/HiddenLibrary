package userInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class CommandLine extends JFrame {
	private JTextArea commandPrompt;
	private ArrayList<String> allLines;

	public CommandLine() {
		allLines = new ArrayList<String>();

		setLayout(new FlowLayout());

		commandPrompt = new JTextArea();
		commandPrompt.setEditable(false);
		JPanel commandPanel = new JPanel();
		commandPanel.setLayout(new BorderLayout());
		JScrollPane commandScrollPane = new JScrollPane(commandPrompt);
		commandPanel.add(commandScrollPane, BorderLayout.CENTER);
		commandPanel.setPreferredSize(new Dimension(250, 330));

		add(commandPanel);

		setVisible(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 340);
		setResizable(false);
		dispose();
		setUndecorated(true);

		addLine("                  ---PROGRAM START---");

	}

	public void addLine(String line) {
		allLines.add(line);
		printLine();
	}

	public void printLine() {
		String printLines = "";
		for (String string : allLines) {
			printLines = printLines + string + "\n";
		}
		commandPrompt.setText(printLines);
	}
}
