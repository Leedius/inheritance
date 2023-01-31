import java.sql.SQLOutput;

public class Man {
    String name;

    //기본 생성자 생성
    public Man(){
        System.out.println("Man 생성자 호출");
        this.name = "";
    }

    //기본 생성자X
    public Man(String name){
        this.name = name;
    }

    public void tellName(){
        System.out.println("이름은 : "+name);
    }
}

//상속의 문법 : 클래스명 extends 상속 받을 클래스명
//상속 받은 클래스에서 정의된 변수 및 메소드를 가지게 된다.
//여러 클래스에게 상속이 가능하다.
//      Man         BusinessMan
//    부모클래스       자식클래스
//    수퍼클래스       서브클래스
//    상위클래스       하위클래스
//BusinessMan이 Man이라는 클래스로부터 상속받는 코드
class BusinessMan extends Man{

    //기존에 Man에서 상속받은 name라는 변수와 company라는 변수 2개를 가짐
    String company;

    //멤버변수 company에 매개변수를 받아 생성자 생성
    //부모 클래스에 생성자가 기본 생성자가 아닐경우 오류
    //기본 생성자가 없을시 부모 클래스에 기본 생성자 생성
    //만약 기본 생성자를 사용하고 싶지 않을시 super()안에
    //부모 클래스 생성자에 해당하는 매개변수 정보와 동일한 값을 넣는다.
    public BusinessMan(){
        //super() : 부모클래스의 !기본! 생성자 호출. 기본적으로 해당코드가 숨어있다
        super();
        System.out.println("BusinessMan 생성자 호출");
        this.company = "";
        //상속받은 클래스에서 변수를 초기화 할수있지만 부모클래스에 있는 변수는
        //부모클래스에서 초기화 하는 것이 좋다.
        name = "";
    }

    //제 직장을 출력하는 메소드
    public void tellInfo(){
        System.out.println("제 직장은 "+company);
    }
}