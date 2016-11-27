 
public class Rogue extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    double critChance; //rogues have a chance to crit 10% of the time, dealing 1,5 times damage.

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Rogue() {
	_name = "Chrysanths";
	_hitPts = 30;
	_strength = 350;
	_defense = 15;
	_attack = .8;
	critChance = 0.1;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Rogue( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    //prepare a Rogue for a special attack
    public void specialize() {
	_attack = 1.5;
	_defense = 10;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .8;
	_defense = 25;
    }

    public void heal(){

    }

    public int attack( Character opponent ) {
	int damage;
	if (Math.random() < critChance){
	    damage = (int)( (_strength * _attack * 1.5) - opponent.getDefense() );
	    //System.out.println( "\t\t**DIAG** damage: " + damage );
	}
	else{
	    damage = (int)( (_strength * _attack) - opponent.getDefense() );
	    //System.out.println( "\t\t**DIAG** damage: " + damage );
	}
	if ( damage < 0 ){
	    damage = 0;
	}
	opponent.lowerHP( damage );

	return damage;
    }//end attack
}//end class Rogue

