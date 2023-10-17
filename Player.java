/*
Player (12 tasks)
  🔳 - private instance vars for health, kickStrength, punchStrength, enemiesDefeated, Room currentRoom, Item backpack
  ✅ + NoArgsConstructor
  🔳 + int getEnemiesDefeated
  🔳 + int getHealth
  🔳 + int getKickStrength
  🔳 + int getPunchStrength
  🔳 + Room getCurrentRoom
  🔳 + Item getBackpack
  🔳 + void increaseEnemiesDefeated() // increases by 1
  ✅ + void loseHealth(int damage) // reduces health by damage
  🔳 + void setCurrentRoom(Room newRoom)
  🔳 + void setBackpack(Item newItem)
  🔳 + toString() // returns all the player stats
*/
public class Player
{
    // private instance vars go here

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
    * Sets the health after the player takes damage. 
    * @param int  The amount of damage the player takes
    */
    public void loseHealth(int damage) 
    {
       health -= damage;  
    }

}
