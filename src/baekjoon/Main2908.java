package baekjoon;

import java.util.Scanner;

public class Main2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String k = sc.next();
        String ntmp = "";
        String ktmp = "";

        for(int i = 0; i < 3; i++) {
            ntmp= ntmp + n.charAt(2-i);
            ktmp= ktmp + k.charAt(2-i);
        }
        int nrev = Integer.parseInt(ntmp);
        int krev = Integer.parseInt(ktmp);
        if(nrev > krev) {
            System.out.println(nrev);
        } else {
            System.out.println(krev);
        }
    }
}
