import java.io.*;
import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get player's name and difficulty level
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Choose difficulty level (easy, medium, hard): ");
        String difficultyLevel = scanner.nextLine().toLowerCase();

        // Validate difficulty level
        if (!difficultyLevel.equals("easy") && !difficultyLevel.equals("medium") && !difficultyLevel.equals("hard")) {
            System.out.println("Invalid difficulty level! Exiting the program.");
            return;
        }

        int score = 0;

        // Read questions from file
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/HP/IdeaProjects/javasamiul/out/production/javasamiul/game.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 3) continue;

                String question = parts[0].trim();
                String level = parts[1].trim().toLowerCase();
                int correctAnswer = Integer.parseInt(parts[2].trim());

                // Only show questions matching the chosen difficulty level
                if (level.equals(difficultyLevel)) {
                    System.out.print(question + " ");
                    int playerAnswer = scanner.nextInt();

                    if (playerAnswer == correctAnswer) {
                        System.out.println("Correct!");
                        score += 10; // Assign points for a correct answer
                    } else {
                        System.out.println("Wrong! The correct answer is: " + correctAnswer);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading questions file: " + e.getMessage());
            return;
        }

        // Save score to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/HP/IdeaProjects/javasamiul/src/scores.txt", true))) {
            bw.write(playerName + " (" + difficultyLevel + ") - Score: " + score);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to scores file: " + e.getMessage());
        }

        System.out.println("Your total score: " + score);
        System.out.println("Thank you for playing, " + playerName + "!");
    }
}
