package baekjoon;

import java.util.Scanner;

public class Main8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hap = 0;
        for (int i = 0; i <= n; i++) {
                 hap += i;
            }System.out.println(hap);
        }
    }

