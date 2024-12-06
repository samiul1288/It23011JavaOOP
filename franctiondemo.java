package samiuljava;
import java.util.*;
public class franctiondemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter Range number: ");
        int num = input.nextInt();
         fact myfact = new fact();
        myfact.findFactorial(num);
    }
}

