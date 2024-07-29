package baekjoon;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Code09_09 {
    public static void main(String[] args) {
        String[] strArr = {"사과", "복숭아", "딸기", "수박"};
        System.out.println("원본 : " + Arrays.toString(strArr));

        Collections.reverse(Arrays.asList(strArr));

        System.out.println("역순 : " + Arrays.toString(strArr));
    }
}
