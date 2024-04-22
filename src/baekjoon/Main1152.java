package baekjoon;

import java.util.Scanner;

public class Main1152 {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            String str;
            int cnt = 0;

            str = input.nextLine();

            for(int j = 0; j < str.length(); j ++){	//우선 공백의 개수를 먼저 세아린다
                if(str.charAt(j) == ' '){
                    cnt++;
                }
            }

            if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' '){ //첫 번째와 마지막이 공백이 아닌 경우
                cnt = cnt + 1;
            }
            if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' '){ //첫 번째와 마지막이 공백인 경우
                cnt = cnt - 1;
            }
            System.out.println(cnt);

        }
    }