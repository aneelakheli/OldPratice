class ThrowDemo 
{
   static public void eligibility(int age)  
   {
       if(age<18)
	{
       throw new ArithmeticException("under age");
      }
	else{
	System.out.println("eligible to vote");
	}
	
	}

public static void main(String[] args)
{
	try
	{
	eligibility(16);
	
	}
	catch(Exception e)
	{
	
	System.out.println("Exception occured");
	}
}

}