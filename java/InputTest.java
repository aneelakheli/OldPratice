

import java.util.*;

public class InputTest
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
   /* Console cons = System.console();
    String username = cons.readLine("user name: ");
    char[] passwd = cons.readPassword("password: ");
*/

    System.out.print("What is your name?");
    String name=in.nextLine();

    System.out.print("how old are you?");
    int age = in.nextInt();

     System.out.print("hello, "+ name+".Next year,you'll be " + (age+1));

  



   }


}