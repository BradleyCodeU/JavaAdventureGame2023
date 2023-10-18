/*
Item (9 tasks)
  🔳 - private instance vars for name, strength, description, int magicType
  ✅ + NoArgsConstructor
  ✅ + Item(String _name, String _description)
  🔳 + int getMagicType()
  🔳 + String getName()
  🔳 + int getStrength()
  🔳 + void setDescription(String d)
  🔳 + void setName(String _name)
  🔳 + isBroken() // returns true if the strength is zero or less, otherwise returns true
  🔳 + toString() // returns the description
  🔳 + void weaken() // sets strength to be strength divided by two
*/
public class Item
{
  // instance variables go here
  // private instance vars for name, strength, description, int magicType
  /** 
   represents the item's name
  */
  private String name;
  /** 
   represents the item's strength
  */
  private int strength;
  /** 
   represents the item's description
  */
  private String description;
    /** 
   represents the item's magic type
  */
  private int magicType;


  
  public Item()
  {
    // set magicType to a random number 1-3 (inclusive)
    name = "item name";
    strength = 50;
    description = "item description";
    magicType = (int)(Math.random()*3+1);
  }


  public Item(String _name, String _description)
  {
    name = _name;
    strength = 50;
    description = _description;
    // set magicType to 1
    magicType = 1;
  }

  // methods go down here

  /** void setDescription()
  returns the description of the item
  */
  public void setDescription(String d){
     description = d;
  }
  /** void weaken()
  makes strength = strength divided byy2
  */
  public void weaken(){
    strength = strength/2;
  }
  /** String toString()
  returns the description and replaces the pre made toString
  */
  public String toString(){
    return description;
  }


}

