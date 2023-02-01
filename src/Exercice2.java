/**
 * @author ETOUMI Aristide
 * @apiNote DI-Bootcamp Week6 Day2 ExercicesXP | Exercice 2: Numbers Triangle
 */

/*
Write a Java program that uses the loops to produce the following output:

1
22
333
4444
55555
666666
7777777
*/
public class Exercice2 {
    public static void execute() {
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
