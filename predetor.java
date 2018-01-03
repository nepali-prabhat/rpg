package rpg;

public enum predetor{
	tiger(50,5,400,250),hunter(70,3,300,600),beer(80,4,500,250);
	int d_r, speed, hp;	
	int mana;
	/**
	 * sets different values for objects
	 * @param dr : damage ratio 
	 * @param speed speed of attack
	 * @param hp hit points
	 * @param mana spirit to case spells
	 */
	predetor(int dr, int speed, int hp, int mana ){
		d_r=dr;
		this.speed=speed;
		this.hp=hp;
		this.mana = mana;
	}
	/**
	 * 
	 * @return mana of the predetor
	 */
	 public int getMana() {
		return mana;
	 }
	 /**
	  * decreases mana when called
	  * used when predetor casts a spell
	  * @param mana mana to be decreased
	  */
	 public void decreaseMana(int mana) {
		this.mana -= mana;
	 }
	 /**
	  * 
	  * @return damage ratio of the predetor
	  */
	public int getD_r() {
		return d_r;
	}
	/**
	 * 
	 * @param d_r sets new damage ratio when called
	 */
	
	public void setD_r(int d_r) {
		this.d_r = d_r;
	}
	/**
	 * 
	 * @return speed o the predetor
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * 
	 * @param speed new speed 
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * 
	 * @return hit points
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * reduces hp of the predetor if any damage is dealt
	 * @param a_d damage inflected
	 */
	public void reduceHp(int a_d) {
		hp = (hp-a_d<0)? 0:hp-a_d;
	}
	/**
	 * incareases hp by 40%
	 */
	public void increaseHp() {
		hp += .40*hp;
	}
	/** 
	 * when predetor is hit by a prey
	 * @param p the prey what attached it
	 */
	
	public void attack(prey p) {
		p.reduceHp(this.d_r);
	}
}
