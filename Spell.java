package game;//The package is called game. This class is a part of this package.

public abstract class Spell {
	public boolean checkMana(Player p, int mana) {//We are sending it the information of who is casting it, call this "p" as a variable.
		return p.checkMana(mana);
	}
	
	public abstract void cast (Player p);

}