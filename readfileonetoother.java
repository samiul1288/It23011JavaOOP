package javaFileRead;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class readfileonetoother {
    public static void main(String[] args) {
        // Define input and output files
        File inputFile = new File("C:/Users/HP/IdeaProjects/javasamiul/a1.txt");
        File outputFile = new File("C:/Users/HP/IdeaProjects/javasamiul/a2.txt");

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

            int highest = Integer.MIN_VALUE;
            int sum = 0;

            // Read integers from the input file
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                if (number > highest) {
                    highest = number;
                }
            }

            // Write the highest value and sum to the output file
            writer.println("Highest Value: " + highest);
            writer.println("Sum: " + sum);

            System.out.println("Results written to " + outputFile.getName());

        } catch (FileNotFoundException e) {
            System.err.println("Error: Input or output file not found.");
        }
    }
}
//input 10 20 30 40 50
//highest value =60
//sum=150



