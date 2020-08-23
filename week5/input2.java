package Week5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class input2 {


public static void main(String[] args) {

try {

FileOutputStream fout=new FileOutputStream("abx.txt",true);

PrintStream ps=new PrintStream(fout);
for(int i=0;ps.equals("!");i++)
{
	ps.println("");
}
     

System.out.println("DONE");

}
catch (FileNotFoundException e) {
e.printStackTrace();
} 
catch (IOException e) {

e.printStackTrace();
}
}
}
