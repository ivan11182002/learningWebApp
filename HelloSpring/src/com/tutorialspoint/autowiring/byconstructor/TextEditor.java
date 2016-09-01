package com.tutorialspoint.autowiring.byconstructor;

import com.tutorialspoint.di.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor(SpellChecker spellChecker, String name) {
		this.spellChecker = spellChecker;
		this.name = name;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public String getName() {
		System.out.println("Hello " + name);
		return name;
	}
	

	public void spellCheck(){
		spellChecker.spellCheck();
	}
}
