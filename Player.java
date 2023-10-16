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
  🔳 + int getPunchStrength
  🔳 + Room getCurrentRoom
  🔳 + Item getBackpack
  🔳 + void increaseEnemiesDefeated() // increases by 1
  🟧 + void loseHealth(int damage) // reduces health by damage
  🔳 + void setCurrentRoom(Room newRoom)
  🔳 + void setBackpack(Item newItem)
  🔳 + toString() // returns all the player stats
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
    int getEnemiesDefeated(){
      return enemiesDefeated;
    }


  
    /**
    int getHealth()
    returns the health of the player
    @return the health of the player
  */
    int getHealth(){
      return health
    }


  
  /**
    int getkickStrength()
    returns the kick strength of the player
    @return the kick strength of the player
  */
    int getKickStrength(){
      return kickStrength;
    }
}
  
