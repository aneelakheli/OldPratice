import java.io.FileWriter;

public class CreateFle
{
	 public static void main(String[] args)
	  {
	
try{
	 FileWriter fw = new FileWriter("pokhara.txt");
	
	 fw.write("hi pokhara");
	 fw.close();	
} catch(Exception e)
{
System.out.println(e);


}System.out.println("successfully");
	}
	int i;
	while(i = fw.read()!=-1)
		System.out.println((char)i);
	fw.close();

}