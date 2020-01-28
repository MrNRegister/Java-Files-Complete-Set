package game;//The package is called game. This class is a part of this package.

public class Player extends Creature {
	private Spellbook sb;//The player has a spell book, call this "sb" in a variable.
	private int currentMana;//This is saying that currentMana is a number.
  
  public Player (Spellbook sb, int cm){//This is the constructor which creates a player, in order to create a player you need to send this constructor a Spellbook and the currentMana "cm".
  this.sb = sb;
  this.currentMana = cm;//This is saying the currentMana of the player should be equal to the value of "cm".
  System.out.println("You are a player, your starting mana level is " +cm + ".");
  }
  
  public boolean checkMana(int mana) {//This is a true or false checker called "checkMana". We are sending it an integer (MANA_COST); call this integer "mana".
	  if (currentMana>=mana) {//Check if the currentMana of the player is greater than or equal to mana (MANA_COST).
		  currentMana -= mana;//Take away the value of "mana" (MANA_COST) from "currentMana" if the condition is met.
		
		  return true;//Then return a true value.
	  }
	  return false;//Otherwise return a false value and thus display the error message located in Fireball.
  }
  
  public Spellbook readSpellBook(){//This is a behaviour, it sends a Spellbook to the place it was called and displays all of the spells in it.
  return sb;
  }
  
  public int showMana(){//This is a behaviour, it returns the "currentMana" level of the player to the place it was called.
	  return currentMana;
  }
  
  public void setMana(int manaCost) {//We are sending this method an integer, call this "manaCost".
	  this.currentMana -= manaCost;//Reduce the players "currentMana" by the number "(manaCost)" sent to the method.
  }
  
}