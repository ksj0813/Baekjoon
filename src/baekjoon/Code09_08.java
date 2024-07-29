package baekjoon;
import java.util.Arrays;
import java.util.Collections;
public class Code09_08 {
    public static void main(String[] args) {
        int[] numAry = { 33, 55, 88, 56};
        Arrays.sort(numAry);
        for(int data : numAry) {
            System.out.print(data + " ");
        }
        System.out.println();
        String[] strAry = { "A", "B", "C", "D", "E", "F" };
        Arrays.sort(strAry,Collections.reverseOrder());
        for(String data : strAry) {
            System.out.print(data + " ");
        }
    }
}
