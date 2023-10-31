public enum MagicType
{
  // class variables 
  // fire = 0; ice = 1; lightning = 2
  /** 
   * Represents fire magic
   */ 
  FIRE,
  /** 
   * Represents ice magic
   */ 
  ICE,
  /** 
   * Represents lightning magic
   */ 
  LIGHTNING;
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
    else if(dice == 1){
      return MagicType.ICE;
    }
    else {
      return MagicType.LIGHTNING;
    }
  }

  @Override
  public String toString() {
      switch (this.ordinal()) {
          case 0:
              return "Fire";
          case 1:
              return "Ice";
          case 2:
              return "Lightning";
          default:
              return null;
      }
  }
  

}
