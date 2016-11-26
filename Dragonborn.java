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

}//end class Dragonborn
