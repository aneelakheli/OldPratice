interface toyota
 {
   public void test();

 }

class Car implements toyota
{
public void test()
	{
	  System.out.println("toyota ho hai");	

	}


   public static void main(String args[])
   {
     toyota t = new Car();
     t.test();
  }
}