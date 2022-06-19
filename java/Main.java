class MyException extends Exception 
{ 
	public MyException(String s) 
	{ 
		
		super(s); 
	} 
} 

public class Main 
{ 
	
	public static void main(String args[]) 
	{ 
		try
		{ 
			
			throw new MyException("bhujdai bhujina"); 
		} 
		catch (MyException ex) 
		{ 
			System.out.println("halka halka bhujey jasto vako theyo tara."); 
			System.out.println(ex.getMessage()); 
		} 
	} 
} 
