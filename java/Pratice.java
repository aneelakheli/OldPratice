public class Pratice
{
   int call_a(int x)
   {
      return call_b(x*=15);
	}
   int call_b(int x)
	{
	 return call_c(x/=15);
	}
    int call_c(int x)
   {
     return call_d(x-=15);
   }
   int call_d(int x)
    {
     return x+=15;
     }
   public static void main(String args[])
     {
       System.out.println(call_a(15));
      }


}