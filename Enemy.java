/*
Enemy extends Npc (6 tasks)
  🔳 - private instance vars for health, int magicWeakness, attackName
  ✅ + NoArgsConstructor
  ✅ + Enemy(String _name, String _description)
  🔳 + String getAttackName()
  🔳 + int getHealth
  ✅ + int getMagicWeakness()
  🔳 + void loseHealth(int h)
  🔳 + void setAttackName()
*/
public class Enemy extends Npc
{
  // class variables
  private static int enemyCounter = 0;

  // class methods
  public static int getEnemyCounter()
  {
    return 0;
  }

  // instance variables go here
  private int health;
  private int magicWeakness;
  private String attackName;
  // private instance vars for health, int magicWeakness, attackName

  public Enemy(){
    super();
    health = 100;
    magicWeakness = 1;
    attackName = "slap";
    enemyCounter++;
  }

  public Enemy(String enemyName, String enemyDescription){
    super(enemyName,enemyDescription);
    health = 100;
    magicWeakness = 1;
    attackName = "slap";
    enemyCounter++;
  }

  // methods go down here

  /**
    Gets the Magic Weakness of the enemy
    @return Int  Returns Magic Weakness
  */
  public int getMagicWeakness()
  {
    return magicWeakness;
  }

  /**
  * The getAttackName method returns attackName as a String.
  * @return String   The name of the attack.
  */
  public String getAttackName(){
    return attackName;
  }

  /**
  * The getHealth method returns the health of the enemy as an integer.
  * @return int   The health of the enemy.
  */
  public int getHealth(){
    return health;
  }

  /**
  * The getMagicWeakness method returns the magicWeakness of the enemy as an integer.
  * @return int   The magicWeakness of the enemy.
  */
  public int getMagicWeakness(){
    return magicWeakness;
  }

  /** void loseHealth()
  * Decreases the health by specified amount.
  * @param int h   integer to decrease by
  */
  public void loseHealth(int h){
    health = health - h;
  }

  /** void setAttackName()
  * Sets the attackName to specified string.
  * @param String _attackName   A string that will replace the attackName
  */
  public void setAttackName(String _attackName){
    attackName = _attackName;
  }


}

