package userInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	private JButton encrypt, decrypt;
	private JButton commandlineOn, commandlineOff;
	private JTextField input, display;
	private JLabel commandLable;
	private CommandLine commandLine;

	public MyFrame() {
		setLayout(new FlowLayout());

		input = new JTextField();
		display = new JTextField();
		display.setEditable(false);

		input.setPreferredSize(new Dimension(200, 20));
		display.setPreferredSize(new Dimension(200, 20));

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

		add(input);
		add(display);

		add(encrypt);
		add(decrypt);

		add(commandLable);
		add(commandlineOn);
		add(commandlineOff);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 200);
	}

	public void actionPerformed(ActionEvent e) {
		if(commandLine == null){
			commandLine= new CommandLine();
		}
		if (e.getSource() == encrypt) {
		}
		if (e.getSource() == decrypt) {
		}
		if (e.getSource() == commandlineOn) {
			commandlineOff.setEnabled(true);
			commandlineOn.setEnabled(false);
			
			int x = (int) getLocationOnScreen().getX();
			x = x + getWidth();
			int y = (int) getLocationOnScreen().getY();
			commandLine.setLocation(x, y);
			commandLine.setVisible(true);
		}
		if (e.getSource() == commandlineOff) {
			commandlineOff.setEnabled(false);
			commandlineOn.setEnabled(true);
			
			commandLine.setVisible(false);
			
		}
	}

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}
