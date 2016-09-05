package com.tutorialspoint.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import com.tutorialspoint.annotation.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void checkSpell(){
		spellChecker.spellCheck();
	}
}
