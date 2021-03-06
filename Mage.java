 
public class Mage extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	_name = "Antonidas";
	_hitPts = 50;
	_strength = 200;
	_defense = 25;
	_attack = .8;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Mage( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    //prepare a Mage for a special attack
    public void specialize() {
	_attack = 1.5;
	_defense = 10;
    }
	
    public void heal(){
	int inc = (int)(Math.random() * 20);
	_defense += inc;
    }

    public void shrinkify() {}
    
    //revert to normal mode
    public void normalize() {
	_attack = .8;
	_defense = 25;
    }

    public int attack( Character opponent ) {

	int damage = (int)( (_strength * _attack) - opponent.getDefense() );
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 ){
	    damage = 0;
	}
	opponent.lowerHP( damage );

	return damage;
    }//end attack
}//end class Mage

