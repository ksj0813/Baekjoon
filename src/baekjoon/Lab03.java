package baekjoon;

import java.util.Scanner;
public class Lab03 {
    static boolean checkPassword(String password) {
    if (password.length() < 8)
        return false;
        for (int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c))
                return false;
        }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String password;

            System.out.print("새로운 비밀번호를 입력하세요:");
            password = sc.next();

            if(checkPassword(password))
                System.out.println("good");
            else
                System.out.println("bad");
        }

}
