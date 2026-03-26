package com.app;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ExamService exam = new ExamService();

        while (true) {
            System.out.println("\n1. Start Exam");
            System.out.println("2. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    exam.startExam();
                    break;

                case 2:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}