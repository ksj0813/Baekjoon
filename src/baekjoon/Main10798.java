package baekjoon;

import java.util.Scanner;

public class Main10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] a = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                a[i][j] = s.charAt(j);
            }
            if(a[i].length > max){
                max = a[i].length;
            }
        }
        System.out.println(max);
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(a[j][i] == '\0') {
                    continue;
                }
                System.out.print(a[j][i]);
            }
        }
    }
}



