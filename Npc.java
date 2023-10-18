/*
Npc (7 tasks)
🔳 - private instance vars for name, speech, description
✅ + NoArgsConstructor
✅ + Npc(String _name, String _description)
✅ + String getName
🔳 + String getSpeech
🔳 + void setDescription(String d)
🔳 + void setName(String _name)
🔳 + void setSpeech
🔳 + toString() // returns the description
*/
public class Npc
{
  // instance variable go here
  // private instance vars for name, speech, description

  public Npc()
  {
    name = "James Charles Bartholemule II";
    speech = "Why hello there traveler... I've been expecting a main character such as yourself to cross paths with me...";
    description = "James Charles was his original name until he was banished from his village for doing questionable acts, he was raised by a wise tree named Bartholemule...";
  }

  public Npc(String newName, String newDescription)
  {
    name = newName;
    description = newDescription;
    speech = "Why hello there traveler... I've been expecting a main character such as yourself to cross paths with me...";
  }

  // methods go down here
  /**
    Gets the name of the NPC
    @return String  Returns the name of the NPC
  */
  public String getName() 
  {
    return name;
  }
  


}
