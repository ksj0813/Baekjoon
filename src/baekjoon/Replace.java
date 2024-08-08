package baekjoon;

public class Replace {
    public static void main(String[] args) {
        String s = " 여름 방학 ";
        String cutStr = "";
        cutStr = s.replaceAll(" " , "");
        System.out.println("절대보존 ==>  [" + cutStr + "]");

    }
}
