package baekjoon;

public class Pratice10_09 {
    static int[] method3(int v1, int v2) {
        int res1 = v1 + v2;
        int res2 = v1 - v2;
        return new int[] {res1, res2};
    }

    public static void main(String[] args) {
        int num1=100, num2=200;
        int[] resAry;

        resAry = method3(num1, num2);
    }
}
