package study.ex5;

public class CakeTest {
    public static void main(String[] args) {


        //Cake에서 c1이 선언되었기 떄문에 Cake에 있는 메소드 1개 사용가능
        Cake c1 = new CheeseCake();

        //형변환
        //형변환을 객체의 자료형을 변경할 수 있고,
        //그로인해 변수 및 메소드도 다~ 사용할 수 있다.
        CheeseCake c11 =(CheeseCake)c1;


        //Cake에서 c1이 선언되었기 떄문에 Cake에 있는 메소드 1개 사용가능
        Cake c2 = new StrawberryCheeseCake();

        //하위클래스CheeseCake 부모클래스Cake를
        //CheeseCake c3 = new Cake();

        //CheeseCake에서 c4가 선언되었기때문에 CheeseCake의 메소드 1개와
        //상위클래스 Cake메소드 1개를 더해 총 2개 메소드가 사용가능.
        CheeseCake c4 = new StrawberryCheeseCake();
        //형변환
        //더 상위클래스 형태로 바꿀수도 있다.
        Cake c14 = (Cake) c4;
        c14.eatCake();


        //StrawberryCheeseCake(); c5 = new Cake();


    }
}
