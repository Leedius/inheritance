package study.object;

import javax.print.attribute.standard.PrinterURI;

public class ToStringTest {
    private String name;
    private int age;
    private String addr;
    private String tell;
    private String email;

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("연락처 : " + tell);
        System.out.println("메일 : " + email);
    }

    @Override
    public String toString() {
        return "ToStringTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", tell='" + tell + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
