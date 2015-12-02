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
		woorden = new ArrayList<Woord>();
	}

	public void controleer(String kastLocatie) {
		String root = "C:/Users/floris/Desktop/crypt/project/";
		File kast;
		int teller = 0;
		int pos = 0;
		try {
			FileReader fr;
			Scanner sc;
			while (true) {
				kast = new File(root + kastLocatie+ ++teller + ".txt");
				if (!kast.exists()) {
					break;
				}
				fr = new FileReader(kast);
				sc = new Scanner(fr);
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
			}
//			sc.close();
//			fr.close();
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
