package game;//The package is called game. This class is a part of this package.

import java.util.*;//Import everything from java.util. Everything is represented by *.
public class Spellbook{
	private ArrayList<Spell> spells = new ArrayList();
  
  public void addSpell(Spell s){
  	spells.add(s);
  }
  
  
	public Spellbook() {//This is the constructor that runs when a new instance of the Spellbook class is created.
		
		
		
	}
  
  
  public ArrayList<Spell> getSpells(){//It's a behaviour that returns all the spells in the spell book.
	  return spells;
  }
}

