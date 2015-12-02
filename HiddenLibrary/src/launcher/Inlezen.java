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

	}

	public void controleer(String kastLocatie) {
		String root = "C:/Users/floris/Desktop/crypt/project/";
		File bieb;
		File kast;
		try {
			bieb = new File(root + "bieb");
			kast = new File("C:/Users/floris/Desktop/crypt/project/"+kastLocatie+".txt");
			FileReader fr = new FileReader(kast);
			BufferedReader br = new BufferedReader(fr);
			Scanner sc = new Scanner(fr);
					System.out.println(br.readLine());
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

	public void addWoorden(Woord woord) {
		woorden.add(woord);
	}
}
