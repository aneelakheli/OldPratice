import java.io.*;
public class BUfferWriterExampl
{
 public static void main(String[] args) throws Exception {
fileWriter writer = new fileWriter("pokhara.txt");
BufferedWriter buffer = new BufferedWriter(writer);
buffer.writer("welcome to pokhara");
buffer.close();
System.out.println("success");

 }

}