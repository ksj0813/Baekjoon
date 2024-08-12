package baekjoon;
class Dog {
    static int count;
    Dog() {
        count++;

    }
}

public class Code {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("총 강아지 수 -->" + dog.count);
    }
}