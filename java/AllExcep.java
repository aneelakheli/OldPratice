import java.io.FileOutputStream;
class FileOutputStreamExample
{
 public static void main(String[] args)
	 {
	    try
	      {
		FileOutputStream fout=new FileOutputStream("C:\\Users\\adnan\\Desktop\\java\\test.txt");
		fout.write(a);
		fin.read();
		fout.close();
		System.out.println("successfully ");

	     }
	catch(Exception e) {

		System.out.println(e);
	       }


    }	
}