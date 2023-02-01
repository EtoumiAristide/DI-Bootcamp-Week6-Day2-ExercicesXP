import java.util.Scanner;

public class Exercice1 {
    public static void execute() {
        System.out.println("Entrez le nombre de points :");

        Scanner scanner = new Scanner(System.in);

        try {
            int points = scanner.nextInt();
            String letterGrade = "";
            double gpa = 0.0;
            if (points > 0 && points < 60) {
                letterGrade = "F";
            }
            if (points >= 60 && points < 70) {
                letterGrade = "D";
                gpa = 1.0;
            }
            if (points >= 70 && points < 77) {
                letterGrade = "C";
                gpa = 2.0;
            }
            if (points >= 77 && points < 80) {
                letterGrade = "C+";
                gpa = 2.33;
            }
            if (points >= 80 && points < 83) {
                letterGrade = "B-";
                gpa = 2.67;
            }
            if (points >= 83 && points < 87) {
                letterGrade = "B";
                gpa = 3.0;
            }
            if (points >= 87 && points < 90) {
                letterGrade = "B+";
                gpa = 3.33;
            }
            if (points >= 90 && points < 93) {
                letterGrade = "A-";
                gpa = 3.67;
            }
            if (points >= 92 && points <= 100) {
                letterGrade = "A";
                gpa = 4.0;
            }

            System.out.println("Le grade est " + letterGrade);

        } catch (Exception ex) {
            System.out.println("Veuillez entrer un entier svp!");
            ex.printStackTrace();
        }
    }
}
