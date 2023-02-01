package study.ex6;

public class OverRiding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        //오버라이딩으로 구현된 메소드는
        //자식클래스에서 재정의된 메소드만 호출 가능!
        //상속관계에서만 사용가능.
        d1.sound();
    }
}

//-코드를 재활용해서 간편하게 클래스를 만드는 문법.
//-연관이 있는 여러 클래스를 공통적 규약을 줌으로써 일관적 관리에 유용하다.