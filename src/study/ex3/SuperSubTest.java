package study.ex3;

public class SuperSubTest {
    public static void main(String[] args) {
        //SubCls 기본 생성자를 실행하고 부모 클래스의 기본 생성자를 실행
        SubCls c1 = new SubCls(); //

        System.out.println();

        //SuperCls클래스에 매개변수 정수 1개를 갖는 생성자를 실행
        SuperCls c2 = new SuperCls(5);
        System.out.println();

        //SubCls가 부모 클래스가 있기 때문에 부모 클래스 기본 생성자를 실행하고
        //SubCls클래스에 매개변수 정수 한개를 받는 생성자를 실행한다.
        SubCls c3 = new SubCls(3);
        System.out.println();

    }
}
