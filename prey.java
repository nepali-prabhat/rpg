package rpg;
/**
 * one part of the game that contains the preys
 * they are to survive within certain number of moves of the predetors
 */
public enum prey{
	Deer(40, 10,15), Sheep(2,6,0), Elephant(15, 4, 15);
	private int hp,running_speed, a_d;
	/**
	 * constructor for finite number of preys
	 * @param hp 
	 * @param running_speed  
	 * @param a_d 
	 */
   prey(int hp,int running_speed, int a_d){
		this.hp = hp;
		this.running_speed=running_speed;
		this.a_d=a_d;
   }
   /**
    * 
    * @return hit points
    */
	  public int getHp() {
		return hp;
	 }
	  /**
	   * new hp after damage is received
	   * @param a_d damage received
	   */
 	  public void reduceHp(int a_d) {
 		hp = (hp-a_d<0)? 0: hp-a_d;
 	 }
 	  /**
 	   * increases hp if any spell or card is thrown
 	   */
 	 public void increaseHp() {
 		hp += .60*hp;
 	}
 	 /**
 	  * 
 	  * @return the boot speed or running speed of the prey
 	  */
	  public int getRunning_speed() {
		return running_speed;
	 }
	  /**
	   * 
	   * @param running_speed new running speed set for a prey
	   */
	  public void setRunning_speed(int running_speed) {
		this.running_speed = running_speed;
	 }
	  /**
	   * 
	   * @return attack damage of the prey
	   */
	  public int getA_d() {
		return a_d;
	 }
	  /**
	   * 
	   * @param a_d sets new attack damage of the prey 
	   * in case extra damage is done
	   */
	  public void setA_d(int a_d) {
		this.a_d = a_d;
	 }
	  /**
	   * when prey is hit by a predetor
	   * @param p: predetor that attacked
	   * 
	   * reduces original hp
	   */
	  public void attack(predetor p) {
		p.reduceHp(this.a_d);
	 }
	
}
