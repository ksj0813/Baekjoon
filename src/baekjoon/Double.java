package baekjoon;

import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[3];
        int hap = 0;
        double avg;

        System.out.println("제 점수는요");

        for (int i = 0; i < 3; i++) {
            System.out.println("점수 ==> ");
            score[i] = sc.nextInt();

        }

        for (int i = 0; i < 3; i++) {
            hap += score[i];
            avg = (double) hap / 3;

            System.out.printf("평균 점수 : %5.2f", avg);
            sc.close();
        }
    }
}
