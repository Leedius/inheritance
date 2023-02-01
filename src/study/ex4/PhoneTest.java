package study.ex4;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        SmartPhone p2 = new SmartPhone();


        //----------------------------------
        //다형성
        //부모클래스형으로 자식클래스 객체 생성 가능
        //부모클래스의 변수와 메소드만 사용 가능.
        Phone p3 = new SmartPhone();
        p3.sendMsg();

        //오류!!
        //SmartPhone p4 = new Phone();

    }
}
