package JAdvanced.quiz_console_app;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    int[] selections = new int[5];

    public QuestionService() {
        for (int i = 0; i < 5; i++) {
            String options[] = { "opt1", "opt2", "opt3", "opt4" };
            questions[i] = new Question(i, "Question " + i, options, i);
        }
    }

    public void playQuiz() {
        int j = 0;
        for (Question q : questions) {
            System.out.println("Question :" + q.getId());
            System.out.println(q.getQuestion());
            for (int i = 0; i < 4; i++) {
                System.out.println(i + ": " + q.getOptions()[i]);
            }
            System.out.print("Your Selection : ");

            Scanner sc = new Scanner(System.in);
            selections[j] = sc.nextInt();
            j++;
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].getAnswerIndex() == selections[i]) {
                score++;
            }
        }
        System.out.println("Your score is " + score);
    }
}
