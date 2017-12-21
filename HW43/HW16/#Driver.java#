//Nadine Jackson
//APCS1 pd2
//HW16 -- Get it While You Can
//2017-10-15

public class Driver
{
    private static int x; //number of heads that have to come up before we move on
    private static int y; //number of matches before we move on
    private static int matchCtr; //number of matches that have happened
  public static void main( String[] args )
  {
      //the commented block is things tested before that work
      /*
    //build Objects from blueprint specified by class Coin

    //test default constructor

    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

    //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

    //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) 
	    System.out.println( "Matchee matchee!" );
    else
    System.out.println( "No match. Firestarter you can not be." );*/
      x = 150;
      y = 200;
      
      System.out.println("\n\nNew things to test start now:");
      Coin smol = new Coin("penny");
      Coin notSmol = new Coin("dollar");
      while (smol.getHeadsCtr() < x && notSmol.getHeadsCtr() < x){ //while neither coin has gotten x heads
	  smol.flip(); //flip both
	  notSmol.flip();
      }
      System.out.println("One of the following should be exactly 150");
      System.out.println("smol's head count: " + smol.getHeadsCtr());
      System.out.println("notSmol's head count: " + notSmol.getHeadsCtr());

      while (matchCtr < y){
	  smol.flip();
	  notSmol.flip();
	  if (smol.getUpFace() == notSmol.getUpFace()){
		  matchCtr += 1;
	      }
      }

      System.out.println("\nNumber of matches: (should be 200): " + matchCtr);
      matchCtr = 0;
      while (matchCtr < 13000 || matchCtr % 2001 != 0){ //should be 14007 flips
	  smol.flip();
	  notSmol.flip();
	  if (smol.getUpFace() == notSmol.getUpFace()){
		  matchCtr += 1;
	      }
      }
      System.out.println("\nNumber of matches this time: (should be over 13000): " + matchCtr);
      System.out.println("Now some stats:");
      System.out.println("smol's head count: " + smol.getHeadsCtr());
      System.out.println("smol's tail count: " + smol.getTailsCtr());
      System.out.println("notSmol's head count: " + notSmol.getHeadsCtr());
      System.out.println("notSmol's tail count: " + notSmol.getTailsCtr());
      System.out.println("total number of flips: " + smol.getFlipCtr());
      
  }//end main()
    
}//end class
