package javaFileRead;
//import.java.io.Exception;
import java.util.Formatter;
public class JavaWriteinFile {
    public static void main(String[] args) {
        try {
            Formatter ruf = new Formatter("C:/Users/HP/OneDrive/Desktop/student.txt");
            ruf.format("%s %s\r\n", "IT23011", "Samiul");
            ruf.format("%s %s\r\n", "IT23012", "Nadim");
            ruf.format("%s %s\r\n", "IT23013", "Potol");
            ruf.close();
        }catch(Exception e) {
System.out.println(e);
        }
        }
    }

