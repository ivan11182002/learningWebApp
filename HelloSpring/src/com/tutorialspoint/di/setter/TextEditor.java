package com.tutorialspoint.di.setter;

import com.tutorialspoint.di.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;
	
	/*spell check getter*/
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	/*spell check setter*/
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("=== Dependency by Setter ===");
		this.spellChecker = spellChecker;
	}



	public void spellCheck(){
		spellChecker.spellCheck();
	}
}
