package userInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Garden extends JFrame {
	private CryptoFace crypto;
	private TreeFace tree;
	private CommandLine command;

	public Garden() {
		setLayout(new FlowLayout());

		command = new CommandLine();
		tree = new TreeFace();
		crypto = new CryptoFace(this, tree, command);

		crypto.setPreferredSize(new Dimension(350, 340));
		tree.setPreferredSize(new Dimension(200, 340));

		// tree.setBackground(Color.white);
		// branch.setBackground(Color.black);

		add(tree);
		add(crypto);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(576, 350);
		setTitle("HiddenLibrary V0.3");
		crypto.activateCommandLine();
	}

	public static void main(String[] args) {
		new Garden();
	}
}
