package domain;

import java.util.ArrayList;

public class Chapter {
	private ArrayList<Sentence> sentences;
	private int chapterId;
	private String name = "";

	public Chapter(ArrayList<Sentence> sentences, int chapterId) {
		super();
		this.sentences = sentences;
		this.chapterId = chapterId;

	}

	public Chapter(int chapterId) {
		super();
		this.sentences = new ArrayList<Sentence>();
		this.chapterId = chapterId;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addSentence(Sentence sentence) {
		sentences.add(sentence);
	}

	public boolean removeSentence(Sentence sentence) {
		return sentences.remove(sentence);
	}

	public ArrayList<Sentence> getSentences() {
		return sentences;
	}

	public int getChapterId() {
		return chapterId;
	}

}
