// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: \n");
        int score = scanner.nextInt();
        char grade;

        // Calculate the grade using switch case
        if (score < 0 || score > 100) {
            grade = 'I'; // 'I' for Invalid score
        } else {
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }
        }

        System.out.println("Student's grade: " + grade);

        }
    }
}