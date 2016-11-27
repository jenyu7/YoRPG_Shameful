public class Dragonborn extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Dragonborn() {
	_name = "Dovahkiin";
	_hitPts = 300;
	_strength = 250;
	_defense = 50;
	_attack = 2.5;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Dragonborn( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    //prepare a Dragonborn for a special attack
    public void specialize() {
	_attack = 4;
	_defense = 25;
    }

    //revert to normal mode
    public void normalize() {
	_attack = 2.5;
	_defense = 50;
    }

    public int attack( Character opponent ) {
	int attack1;
	int attack2;
	int damage;
	attack1 = (int)( (_strength * _attack) - opponent.getDefense() );
	attack2 = (int)( (_strength * _attack) - opponent.getDefense() );
	damage = attack1 + attack2;
	//System.out.println( "\t\t**DIAG** damage: " + damage );

	if ( damage < 0 ){
	    damage = 0;
	}
	opponent.lowerHP( damage );

	return damage;
    }//end attack

    public void heal(){
	int inc = (int)(Math.random() * 20);
	_defense += inc;
    }
}//end class Dragonborn

