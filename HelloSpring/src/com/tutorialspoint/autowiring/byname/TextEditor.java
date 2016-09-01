package com.tutorialspoint.autowiring.byname;

import com.tutorialspoint.di.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public String getName() {
		System.out.println("Hello " + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*spell check getter*/
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	/*spell check setter*/
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}


	public void spellCheck(){
		spellChecker.spellCheck();
	}
}
