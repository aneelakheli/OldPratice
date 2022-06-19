import java.io.*;

class ThrowsExceptionDemo
{
  static public void method1() throws IOException //kunai pani method lai checked exception used garda .
	{
	throw new IOException("IO exception");
	}
   public static void main(String[] agrs) throws IOException
    {
	//try
	//{
	 method1();
	//}
	//catch(IOException e)
   	//{
	 //System.out.println("Exception");
	//}
     }

}