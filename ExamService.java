package com.app;

import java.util.*;

public class ExamService {

    public void startExam() {
        QuestionDAO dao = new QuestionDAO();
        List<Question> questions = dao.getAllQuestions();

        if (questions.isEmpty()) {
            System.out.println("❌ No questions found in database!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("\n===== ONLINE EXAM STARTED =====");

        for (Question q : questions) {
            System.out.println("\nQ" + q.getId() + ": " + q.getQuestion());
            System.out.println("1. " + q.getOp1());
            System.out.println("2. " + q.getOp2());
            System.out.println("3. " + q.getOp3());
            System.out.println("4. " + q.getOp4());

            System.out.print("Your Answer: ");
            int ans = sc.nextInt();

            if (ans == q.getCorrect()) {
                score++;
            }
        }

        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + questions.size());
    }
}