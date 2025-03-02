import java.util.Scanner;

public class SGCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask the user for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Step 2: Create an array to store marks for each subject
        double[] marks = new double[numSubjects];

        // Step 3: Ask the user to enter marks for each subject
        System.out.println("Enter marks for each subject (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();

            // Check if marks are valid (between 0 and 100)
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                i--; // Ask for the same subject again
            }
        }

        // Step 4: Calculate the total marks
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }

        // Step 5: Calculate the average percentage
        double averagePercentage = totalMarks / numSubjects;

        // Step 6: Assign a grade based on the average percentage
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 7: Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}