package launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Inlezen {
	private ArrayList<Woord> woorden;

	public Inlezen() {
		String locatie = "C:/Users/floris/Desktop/crypt/project/woorden";
		File kast = new File(locatie);
		if (kast.exists()) {
			FileInputStream fis;
			try {
				fis = new FileInputStream(kast);
				ObjectInputStream ois = new ObjectInputStream(fis);
				woorden = (ArrayList<Woord>) ois.readObject();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			woorden = new ArrayList<Woord>();
		}
	}

	public void controleer(String kastLocatie) {
		String root = "C:/Users/floris/Desktop/crypt/project/";
		woorden=new ArrayList<Woord>();
		File kast;
		int teller = 0;
		int pos = 0;
		try {
			FileReader fr;
			Scanner sc;
			while (true) {
				
				kast = new File(root + kastLocatie + ++teller + ".txt");
				if (!kast.exists()||teller>12) {
					break;
				}
				System.out.println(kast.getPath());
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
						woorden.add(w);
					}
					w.addPlaats(pos);

				}
			}
			FileOutputStream fos = new FileOutputStream(root + "woorden");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(woorden);
		} catch (IOException e) {
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

	public void readAll() {
		for (Woord w : woorden) {
			System.out.println("-" +w.getWoord());
		}
	}

	public void addWoorden(Woord woord) {
		woorden.add(woord);
	}
}
