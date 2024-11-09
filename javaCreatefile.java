package javaFileRead;
import java.io.File;
public class javaCreatefile {
    public static void main(String[]args)
    {
        File dir=new File("C:/Users/HP/OneDrive/Desktop/ALL pdf/aluuu");
        dir.mkdir();  // directory will be create
        String dirlocation =dir.getAbsolutePath();// return the path
        System.out.println(dirlocation);
    }
}
