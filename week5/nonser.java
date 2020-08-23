package Week5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class nonser{

public static void main(String[] args) {


try {
FileInputStream fin=new FileInputStream("student.ser");
ObjectInputStream oin=new ObjectInputStream(fin);

Student stud=(Student)oin.readObject();


System.out.println(stud);

} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}



}

}
