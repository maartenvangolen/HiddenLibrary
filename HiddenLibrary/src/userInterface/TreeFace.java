package userInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TreeFace extends JPanel implements ActionListener {
	private ArrayList<String> selectedCodes;

	public TreeFace() {
		selectedCodes = new ArrayList<String>();
	}

	public ArrayList<String> getSelected() {
		return selectedCodes;
	}

	public void actionPerformed(ActionEvent e) {

	}

}
