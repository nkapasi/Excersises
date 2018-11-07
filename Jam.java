class Jam
{
  // Instance Variables
  private String contents ;   // type of fruit in the jar
  private String date  ;      // date of canning
  public int capacity ;      // amount of jam in the jar


  // Constructors
  public Jam( String contents, String date, int size )
  {
    this . contents = contents  ;
    this . date = date ;
    capacity = size;
  }

  // Methods
  public boolean empty ()
  {
    return ( capacity== 0 ) ;
  }

  public String toString()
  {
    return contents + "   " +  date + "   " +  capacity + " fl. oz."  ;
  }

  public void spread ( int fluidOz )
  {
    if ( !empty() )
    {
      if ( fluidOz <= capacity )
      {
        System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents );
        capacity = capacity - fluidOz ;
      }
      else
      {
        System.out.println("Spreading " + capacity + " fluid ounces of " + contents );
        capacity =  0 ;
      }
     }
     else
       System.out.println("No jam in the Jar!");
  }

}

class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }

  Pantry(Jam jar1)
  {
      this . jar1 = jar1 ;
      selected = null;
  }

  Pantry(Jam jar1, Jam jar2)
  {
      this . jar1 = jar1 ;
      this . jar2 = jar2 ;
      selected = null;
  }

  // Methods
  public String toString()
  {
    String str = "";
    if (selected != null)
    {
      str += "1: " +  jar1.toString()  + "\n";
      str += "2: " +  jar2.toString()  + "\n";
      str += "3: " +  jar3.toString()  + "\n";     
      return str;
    }
      
    else {
      str += "Error, selection outside parameters";
      return str;
    }
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public boolean select( int jarNumber )
  {
    if ( jarNumber == 1 ){
      selected =  jar1 ;
      return true;
    }
      

    else if ( jarNumber == 2 ){
      selected = jar2 ;
      return true;
    }
      

    else if(jarNumber == 3){
      selected = jar3 ;
      return true;
    }
      
    else
      return false;
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }

  public void replace(Jam j, int slot){
    if (slot == 1){
      this.Jar1 = j;
    } else if(slot == 2){
      this.jar2 = j;
    } else if(slot ==3){
      this.jar3 =j;
    } else{
      System.out.println("Out of range");
    }
  }

  public void mixedFruit(int date) {
    if (jar1.capacity <= 2 && jar2.capacity <= 2 && jar3.capacity <= 2) {
      String str = "Mixed Fruit";
      Jam mixedFruit = new Jam(str, date, jar1.capacity+jar2.capacity + jar3.capacity);
    } else {
      System.out.println("You have enough jam");
    }
  }
}

