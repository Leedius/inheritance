package study.network_management;

public class ComFriend extends Friend{
    private String department;

    public ComFriend(String name, String tell, String department){
        //super()안에 매개변수 name과 tell을 넣어서 friend 생성자에 대입
        super(name, tell);
        this.department = department;
    }

    //상위클래스 Friend의 showInfo에 오버라이딩
    public void showInfo(){
        //상위클래스 Friend의 showInfo호출
        super.showInfo();
        System.out.println("부서 : " + department);
    }
}
