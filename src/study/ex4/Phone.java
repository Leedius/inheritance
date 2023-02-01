package study.ex4;

//상속 가능 여부는 : IS-A 관계가 충족.!
//ex> student is a person.
public class Phone { //모바일폰
    int phoneNumber;

    //문자를 전송하는 기능을 가진 메소드
    public void sendMsg(){
        System.out.println("문자 전송");
    }
}

class SmartPhone extends Phone{
    String os;

    public void playApp(){
        System.out.println("앱 실행~");
    }

}