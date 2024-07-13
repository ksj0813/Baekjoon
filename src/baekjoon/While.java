package baekjoon;

public class While {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
            while (b < 10) {
                while (a < 10) {
                    System.out.print(a + "x" + b + "=" + (a * b) + "\t");
                    a++;
                }
                System.out.println();
                b++;
                a = 2;
            }
        }
    }


