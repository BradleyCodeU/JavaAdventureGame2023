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



}

