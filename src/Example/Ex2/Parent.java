package Example.Ex2;

import javax.swing.plaf.TableHeaderUI;

public class Parent {
    public String nation;

    public Parent() {

        //this():해당 클래스에 생성자 호출 안에 문자열로된 매개변수가 있으므로
        //Parent(String nation)생성자 호출
        this("대한민국");
        System.out.println("Parent() call");
    }
    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
