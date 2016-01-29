package domain;

import java.util.ArrayList;

public class Sentence {
	private ArrayList<String> words;
	private int sentenceId;
	private String name = "";

	public Sentence(ArrayList<String> words, int sentenceId) {
		super();
		this.words = words;
		this.sentenceId = sentenceId;
	}

	public Sentence(int sentenceId) {
		super();
		this.words = new ArrayList<String>();
		this.sentenceId = sentenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addWord(String word) {
		words.add(word);
	}

	public boolean removeWord(String word) {
		return words.remove(word);
	}

	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}

	public int getSentenceId() {
		return sentenceId;
	}
}
