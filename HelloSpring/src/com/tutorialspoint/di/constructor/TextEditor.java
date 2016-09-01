package com.tutorialspoint.di.constructor;

import com.tutorialspoint.di.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("=== Dependency by Class-Constructor ===");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.spellCheck();
	}
}
