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

  public int getMagicWeakness()
  {
    return magicWeakness;
  }


}

