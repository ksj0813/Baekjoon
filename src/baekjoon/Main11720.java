package baekjoon;

import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();

        int hap = 0;


        for (int i = 0 ; i < n; i++) {
            hap  += a.charAt(i) - '0';
        }
                System.out.print(hap);
            }
        }
