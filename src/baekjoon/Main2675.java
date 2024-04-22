package baekjoon;

import java.util.Scanner;

public class Main2675 { // 입력값만큼 문자열을 반복해주는 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) { //몇번외칠껀지 알려줌

            int a = sc.nextInt(); // 숫자외침
            String s = sc.next(); // 문자열 외침

            for (int j = 0; j <s.length(); j++) { //문자열 길이지정
                for(int k = 0; k < a; k++) { //숫자만큼 반복해줌
                    System.out.print(s.charAt(j)); //문자열 길이대로 나옴
                }
            }
            System.out.println(); //다음줄 나누어줌
        }
    }
}
