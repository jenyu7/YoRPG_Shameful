/*=============================================
  class Character -- superclass for combatants in Ye Olde RPG
  =============================================*/

public abstract class Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String _name;
    protected int _hitPts;
    protected int _strength;
    protected int _defense;
    protected double _attack;
    protected int oldStrength;
    protected int oldDefense;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Character() {
	_name = "No Name";
	_hitPts = 125;
	_strength = 100;
	_defense = 40;
	_attack = .4;
    }

    public Character(String name) {
	this();
	_name = name;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public int getDefense() { return _defense; }
    public String getName() { return _name; }
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    /*=============================================
      boolean isAlive() -- tell whether I am alive
      post: returns boolean indicated alive or dead
      =============================================*/
    public boolean isAlive() {
	return _hitPts > 0;
    }


    /*=============================================
      int attack(Character) -- simulates attack on a Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
            Calls opponent's lowerHP() method to inflict damage. 
	    Returns damage dealt.
      =============================================*/
    public abstract int attack(Character opponent);


    /*=============================================
      void lowerHP(int) -- lowers life by input value
      pre:  Input >= 0
      post: Life instance var is lowered by input ammount.
      =============================================*/
    public void lowerHP( int damageInflicted ) {
	_hitPts = _hitPts - damageInflicted;
	if (_hitPts < 0) {_hitPts = 0;}
    }

    public abstract void heal();
    public abstract void specialize();/*{
	oldStrength = _strength;
	oldDefense = _defense;
		int i = (int)(Math.random() * _defense);
		_strength += i;
		_defense -= i;
		
	}*/
    public abstract void normalize();/*{
		_strength = oldStrength; 
		_defense = oldDefense;
	}*/
    public String about() {
		if (this.getClass() == Warrior.class){
			return "Warrior: A bulky, tanky type of fighter who has a large amount of armor and health to soak up damage. They don't do much damage, but they are also very hard to kill.";
			}
		else if (this.getClass() == Mage.class){
			return "Mage: A fragile fighter that is capable of outputting large amounts of damage with their powerful spells, but have very low health and defense, meaning they also die very quickly.";
			}
		else if (this.getClass() == Rogue.class){
			return "Rogue: A crafty fighter that can deal huge amounts of damage in short bursts. They rely on their speed to get in and out of situations without dying.";
			}
		else if (this.getClass() == Dragonborn.class){
			return "Dragonborn: An absolute beast that can't be stopped by any force, human or otherwise.";
			}
		else if (this.getClass() == Gnome.class){
			return "Gnome: A very weak fighter that doesn't deal much damage and doesn't have much health. They're not really that great at anything, but they're really fun and provide great moral support.";
			}
		else{
			return"What is this? No one knows...";
			}
    }
	

}//end class Character
