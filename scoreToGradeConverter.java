//Develop a program that takes a student's score as input and prints the corresponding grade.
//Use the following grading scale: A (90-100), B (80-89), C (70-79), D (60-69), F (0-59).
import java.util.Scanner;
public class scoreToGradeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's score, between 0 to 100: ");
        int n = sc.nextInt();

        if (n >= 90 && n <= 100) {
            System.out.println("The student's grade is 'A'.");
        } else if (n >= 80 && n <= 89) {
            System.out.println("The student's grade is 'B'.");
        } else if (n >= 70 && n <= 79) {
            System.out.println("The student's grade is 'C'.");
        } else if (n >= 60 && n <= 69) {
            System.out.println("The student's grade is 'D'.");
        } else if (n >= 0 && n <= 59) {
            System.out.println("The student's grade is 'F'.");
        } else {
            System.out.println("You've entered an invalid score.");
        }
    }
}
