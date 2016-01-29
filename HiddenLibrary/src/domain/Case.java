package domain;

import java.util.ArrayList;

public class Case {
	private ArrayList<Shelf> shelves;
	private int caseId;
	private String name = "";

	public Case(ArrayList<Shelf> shelves, int caseId) {
		super();
		this.shelves = shelves;
		this.caseId = caseId;
	}

	public Case(int caseId) {
		super();
		this.shelves = new ArrayList<Shelf>();
		this.caseId = caseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addShelf(Shelf book) {
		shelves.add(book);
	}

	public boolean removeBook(Chapter sentence) {
		return shelves.remove(sentence);
	}

	public ArrayList<Shelf> getShelves() {
		return shelves;
	}

	public int getCaseId() {
		return caseId;
	}

}
