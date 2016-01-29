package task;

import java.util.ArrayList;

import domain.Book;
import domain.Case;
import domain.Chapter;
import domain.Shelf;

public class SearchMachine {
	private ArrayList<Case> cases;

	public SearchMachine() {

	}

	public ArrayList<String> getCases() {
		ArrayList<String> value = new ArrayList<String>();

		for (Case c : cases) {
			value.add(c.getCaseId() + "~" + c.getName());
		}
		return value;
	}

	public ArrayList<String> getItemsFromString(String itemString) {
		ArrayList<String> value = new ArrayList<String>();
		String[] codes = itemString.split("~");

		switch (codes.length) {
		case 1:
			value = getShelvesFromCase(Integer.parseInt(codes[0]));
			break;
		case 2:
			value = getBooksFromShelf(Integer.parseInt(codes[0]), Integer.parseInt(codes[1]));
			break;
		case 3:
			value = getChaptersFromBook(Integer.parseInt(codes[0]), Integer.parseInt(codes[1]),
					Integer.parseInt(codes[2]));
		default:
			System.out.println("DEFAULT getItemsFromString(" + itemString + ") COUNTED:" + codes.length);
		}
		return value;
	}

	private ArrayList<String> getShelvesFromCase(int caseId) {
		ArrayList<String> value = new ArrayList<String>();
		for (Case c : cases) {
			if (c.getCaseId() == caseId) {
				for (Shelf s : c.getShelves()) {
					value.add(c.getCaseId() + "~" + s.getShelfId() + "~" + s.getName());
				}
			}
		}
		return value;
	}

	private ArrayList<String> getBooksFromShelf(int caseId, int shelfId) {
		ArrayList<String> value = new ArrayList<String>();
		for (Case c : cases) {
			if (c.getCaseId() == caseId) {
				for (Shelf s : c.getShelves()) {
					if (s.getShelfId() == shelfId) {
						for (Book b : s.getBooks()) {
							value.add(c.getCaseId() + "~" + s.getShelfId() + "~" + b.getBookId() + "~" + s.getName());
						}
					}
				}
			}
		}
		return value;
	}

	private ArrayList<String> getChaptersFromBook(int caseId, int shelfId, int bookId) {
		ArrayList<String> value = new ArrayList<String>();
		for (Case c : cases) {
			if (c.getCaseId() == caseId) {
				for (Shelf s : c.getShelves()) {
					if (s.getShelfId() == shelfId) {
						for (Book b : s.getBooks()) {
							if (b.getBookId() == bookId) {
								for (Chapter ch : b.getChapters()) {
									value.add(c.getCaseId() + "~" + s.getShelfId() + "~" + b.getBookId() + "~"
											+ ch.getChapterId() + "~" + s.getName());
								}
							}
						}
					}
				}
			}
		}
		return value;
	}
}
