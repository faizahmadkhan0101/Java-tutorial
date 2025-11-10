import java.util.Scanner;

public class class6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Array to store marks
        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        
        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            
            // Validate marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100");
                return;
            }
            
            totalMarks += marks[i];
        }
        
        // Calculate average
        double average = (double) totalMarks / numSubjects;
        
        // Calculate grade
        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display results
        System.out.println("\n===== Student Grade Report =====");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
