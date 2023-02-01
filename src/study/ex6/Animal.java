package study.ex6;

public class Animal {
    public void sound(){
        System.out.println("동물이 웁니다.");
    }
}

class Dog extends Animal{
    //상위클래스의 메소드와 똑같이 사용하여 덮은 것을
    //메소드 오버라이딩이라고 한다.
    //만약 매개변수가 들어가면 오버라이딩이 아니고 오버로딩이다!
    public void sound(){
        //상위클래스의 메소드를 호출할 때에는
        //super. 을 사용하면 된다.
        //super.sound();
        System.out.println("멍멍~");
    }
}

//5개의 팬스가 있다. 강아지(운다), 고양이(운다)를 다룸.
