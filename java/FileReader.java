import java.io.;

public class FileReader
{
	public static void main(String args){
     FileReader fr = new FileReader("pokhara.txt");
     int i ;
     while((i=fr.read())!=-1)
     	System.out.println((char)i);

     pokhara.close();	
     

	}
}