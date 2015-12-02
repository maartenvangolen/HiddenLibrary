package launcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inlezen {
	private ArrayList<Woord> woorden;

	public Inlezen() {
woorden=new ArrayList<Woord>();
	}

	public void controleer(String kastLocatie) {
		String root = "C:/Users/floris/Desktop/crypt/project/";
		File kast;
		int pos = 0;
		try {
			kast = new File(root + kastLocatie + ".txt");
			FileReader fr = new FileReader(kast);
			BufferedReader br = new BufferedReader(fr);
			Scanner sc = new Scanner(fr);
			String s;
			sc.useDelimiter(",| ");

			while (sc.hasNext()) {
				pos++;
				s = sc.next();
				
				Woord w = zoekWoord(s);
				if (w == null) {
					w = new Woord(s);
				}
				w.addPlaats(pos);

			}
			sc.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<Woord> getWoorden() {
		return woorden;
	}

	public void setWoorden(ArrayList<Woord> woorden) {
		this.woorden = woorden;
	}

	public Woord zoekWoord(String naam) {
		Woord woord = null;
		for (Woord w : woorden) {
			if (naam.equals(w.getWoord())) {
				woord = w;
			}
		}
		return woord;
	}

	public void addWoorden(Woord woord) {
		woorden.add(woord);
	}
}
