package baekjoon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if(60>b+c){
                System.out.println((a%24)+" "+ ((b+c)%60));
            }
            else {
                System.out.println(((a + (b+c)/60) % 24 )+" "+ ((b + c) % 60));
            }
    }
}

