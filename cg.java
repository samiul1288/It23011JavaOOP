package samiuljava;
import java.util.Scanner;
public class cg {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Student Information
            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter Number of Courses: ");
            int numCourses = scanner.nextInt();

            int totalCreditsTaken = 0;
            int totalCreditsEarned = 0;
            double totalGradePoints = 0.0;

            for (int i = 1; i <= numCourses; i++) {
                System.out.println("Enter details for Course " + i + ":");

                System.out.print("Enter Credits (Max 3): ");
                int credits = scanner.nextInt();

                System.out.print("Enter Class Test Marks (Max 30): ");
                int ctMarks = scanner.nextInt();

                System.out.print("Enter Attendence Marks (Max 10): ");
                int atMarks = scanner.nextInt();

                System.out.print("Enter Final Exam Marks (Max 60): ");
                int feMarks = scanner.nextInt();

                // Validate input
                if (credits > 3 || ctMarks > 30 || atMarks > 10 || feMarks > 60) {
                    System.out.println("Invalid input for marks. Please enter again.");
                    i--;
                    continue;
                }
                // Calculate total marks and percentage
                int totalMarks = ctMarks + atMarks + feMarks;
                int maxMarks = 30 + 10 + 60;
                double percentage = (totalMarks * 100.0) / maxMarks;

                // Determine grade points and credits earned
                double gradePoints = 0.0;
                if (percentage >= 90) {
                    gradePoints = 4.0; // A
                } else if (percentage >= 80) {
                    gradePoints = 3.7; // A-
                } else if (percentage >= 70) {
                    gradePoints = 3.0; // B
                } else if (percentage >= 60) {
                    gradePoints = 2.7; // B-
                } else if (percentage >= 50) {
                    gradePoints = 2.0; // C
                } else {
                    gradePoints = 0.0; // F
                }

                totalCreditsTaken += credits;
                totalGradePoints += gradePoints * credits;
                if (gradePoints > 0) {
                    totalCreditsEarned += credits;
                }
            }

            // Calculate CGPA
            double cgpa = totalGradePoints / totalCreditsTaken;

            // Determine overall grade
            String overallGrade;
            if (cgpa >= 4.0) {
                overallGrade = "A";
            } else if (cgpa >= 3.7) {
                overallGrade = "A-";
            } else if (cgpa >= 3.0) {
                overallGrade = "B";
            } else if (cgpa >= 2.7) {
                overallGrade = "B-";
            } else if (cgpa >= 2.0) {
                overallGrade = "C";
            } else {
                overallGrade = "F";
            }

            // Output results
            System.out.println("\nStudent ID: " + studentID);
            System.out.println("Credit Taken: " + totalCreditsTaken);
            System.out.println("Credit Earned: " + totalCreditsEarned);
            System.out.printf("CGPA: %.2f\n", cgpa);
            System.out.println("Grade: " + overallGrade);

            scanner.close();
        }
    }


