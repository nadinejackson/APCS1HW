public class Passer
{

  private static int x = 3;
  private static String s = "Hello";


  public static int passInt(int v)
  {
    v += 5;
    return v;
  }

  public static String passStr( String w)
  {
    w += " there";
    return w;
  }



  public static void main( String[] args)
  {
    System.out.println( "int x as initialized: " + x);
    System.out.println( "int x during passInt: " + passInt(x));
    System.out.println( "int x after passInt: " +  x);

    System.out.println( "-----------------------------------------");

    System.out.println( "String s as initialized: " + s);
    System.out.println( "String s during passStr: " + passStr(s));
    System.out.println( "String s after passStr: " +  s);

  } // end main method

} // end class Passer
