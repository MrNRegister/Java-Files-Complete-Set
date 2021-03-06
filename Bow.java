package game;//The package is called game. This class is a part of this package.

public class Bow extends Item implements TargetsCreature {
	final int MANA_COST = 50;//By declaring this as final it saves more memory space as the program knows it's an absolute value that won't change. If later on we decided that fire mage gets -10% to mana required for all fire spells, we'd have to change this.

	public Bow() {//This is the constructor that runs when a new instance of the Fireball class is created.
		
		
		
	}

		
	@Override
	public  String toString() {
		return "Bow, a ranged weapon.";
	}
	
	
}