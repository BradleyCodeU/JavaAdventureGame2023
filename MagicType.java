public class MagicType
{
  // class variables 
  // fire = 0; ice = 1; lightning = 2
  /** 
   * Represents fire magic
   */ 
  public static final int FIRE = 0;
  /** 
   * Represents ice magic
   */ 
  public static final int ICE = 1;
  /** 
   * Represents lightning magic
   */ 
  public static final int LIGHTNING = 2;
  // class methods
  /**
   * Returns a randomly selected MagicType
   * @return a randomly selected MagicType
   */
  public static MagicType getRandomMagicType()
  {
    int dice = (int)(Math.random()*3);
    if(dice == 0){
      return MagicType.FIRE;
    }
  }

}
