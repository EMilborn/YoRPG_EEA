/*=============================================
  class Mage -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Mage extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Mage() {
	    _hitPts = 140;
	_strength = 85;
	_defense = 40;
	_attack = .4;
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
public String about(){
  return "I am the mystical mage, and I am capable of incredible feats. Pick me if you wish to focus on potions and spells";
}

public void specialize(){
  _defense = 10;
  _attack = 1.2;
}

public void normalize(){
	_defense = 40;
	_attack = .4;
}

}//end class Mage

    Status API Training Shop Blog About Pricing 

    © 2015 GitHub, Inc. Terms Privacy Security Contact Help 
