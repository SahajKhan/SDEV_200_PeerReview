import java.util.Scanner;

/**
 * @author Sahaj Khan
 * Write a program that prompts the user to enter the numnber of students and each student's name and score,
 * and finally displays the student with the highest score and the student with the second hightest score.
 * Use the next() method int the Scanner class to read a name rather than using the nextLine() method.
 * @version 1.0
 */
public class TwoHighestScores {
    static class Students {
        String name;
        int score;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStudents;
        Students highestScore = new Students(), secondHighestScore = new Students();
        highestScore.score = 0;
        secondHighestScore.score = 0;

        System.out.println("Enter the number of students.");
        numOfStudents = in.nextInt();
        Students students[] = new Students[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Students();
            System.out.println("Enter the students name.");
            students[i].name = in.next();
            System.out.println("Enter " + students[i].name + "'s score.");
            students[i].score = in.nextInt();

            if (students[i].score > highestScore.score)
                highestScore = students[i];
            else if (students[i].score > secondHighestScore.score)
                secondHighestScore = students[i];
        }

        System.out.printf("Student with the highest score: %s with a score of %d%n", highestScore.name, highestScore.score);
        System.out.printf("Student with the second highest score: %s with a score of %d%n", secondHighestScore.name, secondHighestScore.score);
    }
}