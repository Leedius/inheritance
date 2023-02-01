package study.ex7;

class Ani{
    public void sound(){
        System.out.print("웁니다.");
    }
}

public class Cat extends Ani {
    //상위클래스 Ani에 sound메소드를 오버라이딩!
    public void sound(){
        super.sound();
        System.out.println("야옹~");
    }
}

class Puppy extends Ani{
    //상위클래스 Ani에 sound메소드를 오버라이딩!
    public void sound(){
        super.sound();
        System.out.println("멍멍~");
    }
}
