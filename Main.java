public class Main
{
  public static void main(String[] args)
  {
    // write your code here
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String output;
    String firstN;
    String lastN;


// substring(0,n) - 1st n letters
    firstN = s2.substring(0, n);

  // last n charvters of s1
  //start at index length() - n gives the last n charcters
    lastN = s1.substring( s1.length() - n);
    
    output = LastN + firstN;
    System.out.println(output);
  
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
  
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
