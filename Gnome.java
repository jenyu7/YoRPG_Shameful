 
public class Gnome  extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // other attribs inerited from superclass
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Gnome() {
	_name = "Gelbin Mekkatorque";
	_hitPts = 50;
	_strength = 80;
	_defense = 20;
	_attack = .5;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Gnome( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    
    //prepare a Gnome for a special attack
    public void specialize() {
	_attack = .8;
	_defense = 10;
    }

    //revert to normal mode
    public void normalize() {
	_attack = .5;
	_defense = 20;
    }

    public void heal(){

    }

}//end class Gnome

