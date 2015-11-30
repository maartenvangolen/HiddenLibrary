package launcher;

import java.io.File;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Inlezen {
	private ArrayList<Woord> woorden;
	public Inlezen() {

	}
	
	public void controleer(String kastLocatie){
		String root ="C:/Users/floris/Desktop/crypt/project/";
		File bieb = new File(root+"bieb");
		File kast = new File(root+kastLocatie+"1");
		
//		ObjectInputStream ois = new ObjectInputStream(); 
		if(!bieb.exists()){
			if(kast.exists()){
				
			}
		}
	}
}
