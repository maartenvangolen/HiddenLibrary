package launcher;

import java.util.ArrayList;

public class Woord {
	private ArrayList<Integer> plaatsen;
	private String woord;

	public Woord(String w) {
		setWoord(w);
		setPlaatsen(new ArrayList<Integer>());
	}

	public ArrayList<Integer> getPlaatsen() {
		return plaatsen;
	}

	public void setPlaatsen(ArrayList<Integer> plaatsen) {
		this.plaatsen = plaatsen;
	}
	
	public void addPlaats(int p){
		plaatsen.add(p);
//		System.out.println(p);
	}

	public String getWoord() {
		return woord;
	}

	public void setWoord(String woord) {
		this.woord = woord;
	}
}
