package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
 private List<Word> dizionario = new LinkedList<Word>();

 
	public void addWord(String alienWord, String translation){
	 Word wtemp = new Word(alienWord, translation);
	  for(Word w : dizionario){
		if(w.getAlienWord().equals(alienWord)){
		 wtemp.setTranslation(translation);  
		return;
		}
		}
	  dizionario.add(wtemp);
	}
	
	public String translateWord(String alienWord){
	 for(Word w : dizionario){
	  if(w.getAlienWord().equals(alienWord))
	  return w.getTranslation();
	 }
	 return null;
	}
  
}
