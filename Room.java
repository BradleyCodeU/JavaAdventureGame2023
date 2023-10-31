/*
Room (9 tasks)
✅ - private instance vars for name, description, character, roomItem, Room north, Room south, Room east, Room west
✅ + NoArgsConstructor
✅ + Room(String _name)
🔳 + Npc getCharacter()
🔳 + Item getItem()
✅ + Room getLocationTo(String direction)
✅ + String getName()
✅ + String getPossibleDirections()
✅ + void linkRoom(Room r, String direction)
🔳 + void setCharacter(Npc character)
🔳 + void setDescription(String d) DONE
🔳 + void setItem(Item i)
✅ + void setName(String _name)
🔳 + toString() // returns the description DONE
*/
public class Room
{
  // private instance vars go here
  private String name;
  private String description;
  private Npc character;
  private Item roomItem;
  private Room north;
  private Room south;
  private Room east;
  private Room roomWest;
 
  public Room(){
   name = "room name";
   description = "room description";
   character = null;
   roomItem = null;
   north = null;
   south = null;
   east = null;
   west = null;
  }
 
  public Room(String _name){
   name = _name;
   description = "room description";
   character = null;
   roomItem = null;
   north = null;
   south = null;
   east = null;
   west = null;
  }

  // precondition: direction is either "north" or "south" or "east" or "west"
  public Room getLocationTo(String direction)
  {
    if (direction.equals("north") && north != null){
      return north; 
    }
    else if (direction.equals("south") && south != null){
      return south; 
    }
    else if (direction.equals("east") && east != null){
      return east; 
    }
    else if (direction.equals("west") && west != null){
      return west; 
    }
    else {
      return this; // if none of those, then return the current room
    }
  }

  public String getPossibleDirections()
  {
    String possibleDirections = "Type either: ";
    if(north != null){
      possibleDirections += "north, "
    }
    if(south != null){
      possibleDirections += "south, "
    }
    if(east != null){
      possibleDirections += "east, "
    }
    if(west != null){
      possibleDirections += "west, "
    }
  }

  /**
  String getName() gets the name of the room
  @return returns the name of the room
  */
  public String getName(){
    return name;
  }
  
  /** 
  * linkRoom(Room r, String direction) makes connections between two rooms
  * precondition: direction is either "north" or "south" or "east" or "west"
  * 
  * @param r - a room object should be supplied for the variable r
  * @param direction - direction should be the lowercase words "north" "south" "east" or "west
  */
  public void linkRoom(Room r, String direction)
  {
    if (direction == "south") {
      south = r;
    }
    else if (direction == "north") {
      north = r;
    }
    else if (direction == "west") {
      west = r;
    }
    else if (direction == "east") {
      east = r;
    }
  }
  /** void set room name
  * sets room name to a specific string
  * @param String _name a string that will replace the room name
  */
  public void setName(String _name){
  name = _name;
  }
  
  // methods go down here
  public void getCharacter(){
    return character;
  }
  public void getItem(){
    return roomItem;
}
  public void setCharacter(Npc character){
    this.character = character;
  }

public void setItem(Item i){
  this.Item = Item;
}
  
  public void setDescription(String d){
    this.description = description;
  }


}
