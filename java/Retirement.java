import java.util.*;


public class Retirement 
{
   public static void main(String[] args)
   {
   

      Scanner in = new Scanner(System.in);


      System.out.print("how much money will you contribute everydat?");
      double payment = in.nextDouble();

      System.out.print("interest rate in %: ");
      double interestRate = in.nextDouble();

       double balance = 0;
       int year = 0;
 
        String input;


      do	
	{
	   balance+=payment;
	   double interest = balance * interestRate / 100;
	   balance  += interest;

  	   year++;


            System.out.printf("After years %d , your balace is %,.2f%n", year,balance);

	    System.out.print("Ready to retire?(Y/N  ");
            input = in.next();




	}
      while(input.equals("N"));


   }
  

}
