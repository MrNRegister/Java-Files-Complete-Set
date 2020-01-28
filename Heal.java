package game;//The package is called game. This class is a part of this package.

public class Heal extends Spell implements TargetsCreature {
	final int MANA_COST = 100;//By declaring this as final it saves more memory space as the program knows it's an absolute value that won't change. If later on we decided that fire mage gets -10% to mana required for all fire spells, we'd have to change this.

	public Heal() {//This is the constructor that runs when a new instance of the Heal class is created.	
	}

	@Override
	public void cast (Player p) {
		if (checkMana(p, MANA_COST)) {//Check the player's "p" mana value (the checkMana method is done in the player class) if it's the required amount; then run the method castFireball.
			System.out.println("You cast Heal.");//Print out this line.
			p.setMana(MANA_COST);//Send the MANA_COST to the setMana method in the Player class.
		}
		else {//This is saying that if not, or otherwise.
			System.out.println("You don't have enough mana to cast Heal.");//Then do this, which is display an error message.
		}
	}
	
	
	@Override
	public  String toString() {
		return "Heal, a magical aura.";
	}
	
}