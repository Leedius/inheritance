package study;

public class Parent {
    public void aaa(int a){
        System.out.println("");
    }
}

class Child extends Parent{

    //@ -> anotation 어노테이션
    //어노테이션 : 개발자의 실수를 미연에 방지해주는 기능
    @Override   //오류 Parent클래스의 메소드 aaa에 오버라이딩이 맞지 않기때문에
    public void aaa(int a) {
        System.out.println("A");
    }
}
