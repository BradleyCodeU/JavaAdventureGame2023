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
  🔳 + void loseHealth(int damage) // reduces health by damage
  🔳 + void setCurrentRoom(Room newRoom)
  🔳 + void setBackpack(Item newItem)
  🔳 + toString() // returns all the player stats
*/
public class Player
{
    // private instance vars go here
    int punchStrenth;

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
    void setPunchStrength(int _punchStrength) changes the player's punch strength to the value sent into _punchStrength
    */
    public void setPunchStrength(int _punchStrength){
      punchStrength = _punchStrength;
    }
  
    /**
    int getPunchStrength returns the player's punch strength
    @return punchStrength
    */
    public int getPunchStrength(){
      return punchStrength;
    }

}
