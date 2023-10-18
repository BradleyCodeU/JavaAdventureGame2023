/*
 ✅ : done!
 🟨 : in progress 
(🟧 : in progress by someone else)
 🔳 : unclaimed
Player (12 tasks)
  ✅ - private instance vars for health, kickStrength, punchStrength, enemiesDefeated, Room currentRoom, Item backpack
  ✅ + NoArgsConstructor
  ✅ + int getEnemiesDefeated
  ✅ + int getHealth
  ✅ + int getKickStrength
  ✅ + int getPunchStrength
  🔳 + Room getCurrentRoom
  🔳 + Item getBackpack
  🔳 + void increaseEnemiesDefeated() // increases by 1
  ✅ + void loseHealth(int damage) // reduces health by damage
  🔳 + void setCurrentRoom(Room newRoom)
  🔳 + void setBackpack(Item newItem)
  ✅ + toString() // returns all the player stats
*/
public class Player
{
    // private instance vars go here
    private int health;
    private int kickStrength;
    private int punchStrength;
    private int enemiesDefeated;
    private Room currentRoom;
    private Item backpack;


  
    public Player()
    {
        health = 100;
        kickStrength = (int)(Math.random()*6+1) + (int)(Math.random()*6+1);
        punchStrength = 13 - kickStrength;
        enemiesDefeated = 0;
        currentRoom = null;
        backpack = null;
    }

    // methods go down here
    /**
    int getEnemiesDefeated()
    returns the amount of enemies defeated by the player
    @return the amount of enemies defeated by the player
  */
    public int getEnemiesDefeated(){
      return enemiesDefeated;
    }


  
    /**
    int getHealth()
    returns the health of the player
    @return the health of the player
  */
    public int getHealth(){
      return health;
    }


    /**
    * Sets the health after the player takes damage. 
    * @param int  The amount of damage the player takes
    */
    public void loseHealth(int damage) 
    {
       health -= damage;  
    }

  /**
    int getkickStrength()
    returns the kick strength of the player
    @return the kick strength of the player
  */
    public int getKickStrength(){
      return kickStrength;
    }

    /** String toString()
        @returns the health, kick strength, punch strength, and enemies defeated
    */
    public String toString(){
       String result += "Health is " + health;
       result += "/nKick Strength is " + kickStrength;
       result += "/nPunch Strength is " + punchStrength;
       result += "/n" +  enemiesDefeated + " enemies have been defeated";
       return result;
    }

  
    /**
    int getPunchStrength returns the player's punch strength
    @return punchStrength
    */
    public int getPunchStrength(){
      return punchStrength;
    }

}

