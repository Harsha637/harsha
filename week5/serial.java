package Week5;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class serial {

	public static void main(String[] args) {
		try {

			Student student=new Student("JOHN",10);
			FileOutputStream fout=new FileOutputStream("student.ser");

			ObjectOutputStream o=new ObjectOutputStream(fout);
			o.writeObject(student);

			System.out.println("done");


			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

			}

			

		

	}


