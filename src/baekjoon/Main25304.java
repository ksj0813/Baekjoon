package baekjoon;

import java.util.Scanner;

public class Main25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }
        if (sum == t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
