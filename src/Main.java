// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's score: \n");
        int score = scanner.nextInt();
        char studentGrade;

        if (score <= 100) {
            switch (score / 10) {
                case 10:
                case 9:
                    studentGrade = 'A';
                    break;
                case 8:
                    studentGrade = 'B';
                    break;
                case 7:
                    studentGrade = 'C';
                    break;
                case 6:
                    studentGrade = 'D';
                    break;
                default:
                    studentGrade = 'F';
            }
        } else {
            studentGrade = 'I';


        }

        System.out.println("Student's grade: " + studentGrade);

        }
    }
}