package userInterface;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	private JButton encrypt, decrypt;
	private JTextField input, display;

	public MyFrame() {
		setLayout(new FlowLayout());

		input = new JTextField();
		display = new JTextField();

		encrypt = new JButton("Encrypt");
		decrypt = new JButton("Decrypt");

		decrypt.addActionListener(this);
		encrypt.addActionListener(this);

		add(encrypt);
		add(decrypt);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(270, 200);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == encrypt) {
		}
		if (e.getSource() == decrypt) {
		}
	}
}
