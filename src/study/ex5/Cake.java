package study.ex5;

public class Cake {
    public void eatCake(){
        System.out.println("케잌을 먹다");
    }
}


class CheeseCake extends Cake{
    public void eatCheeseCake(){
        System.out.println("치즈 케잌 먹다.");
    }
}

//상위클래스의 2개의 메소드와 자체적으로 가진 메소드1개를
//포함시켜 총 3개의 메소드를 가진다.
class StrawberryCheeseCake extends CheeseCake{
    public void eatStrawberryCheeseCake(){
        System.out.println("딸기 치즈 케잌 먹다.");
    }
}