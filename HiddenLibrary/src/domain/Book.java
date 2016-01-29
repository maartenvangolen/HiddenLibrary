package domain;

import java.util.ArrayList;

public class Book {
	private ArrayList<Chapter> chapters;
	private int chapterId;
	private String name = "";

	public Book(ArrayList<Chapter> chapters, int chapterId) {
		super();
		this.chapters = chapters;
		this.chapterId = chapterId;
	}

	public Book(int chapterId) {
		super();
		this.chapters = new ArrayList<Chapter>();
		this.chapterId = chapterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addChapter(Chapter chapter) {
		chapters.add(chapter);
	}

	public boolean removeChapter(Chapter chapter) {
		return chapters.remove(chapter);
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public int getChapterId() {
		return chapterId;
	}
}
