package study.ex2;

public class ManTest {
    public static void main(String[] args) {
        BusinessMan m1 = new BusinessMan();
        m1.name = "홍길동";
        System.out.println(m1.name);
        m1.tellName();
        m1.tellInfo();

    }
}
