package launcher;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Inlezen {
	private ArrayList<Woord> woorden;

	public Inlezen() {

	}

	public void controleer(String kastLocatie) throws IOException, ClassNotFoundException {
		String root = "C:/Users/floris/Desktop/crypt/project/";
		File bieb = new File(root + "bieb");
		File kast = new File("C:/Users/floris/Desktop/crypt/project/"+kastLocatie+".txt");
		FileInputStream fis = new FileInputStream(kast);
		ObjectInputStream ois=new ObjectInputStream(fis);
				
				System.out.println((String)ois.readObject());
				ois.close();
				fis.close();
			
	}

	public ArrayList<Woord> getWoorden() {
		return woorden;
	}

	public void setWoorden(ArrayList<Woord> woorden) {
		this.woorden = woorden;
	}

	public void addWoorden(Woord woord) {
		woorden.add(woord);
	}
}
