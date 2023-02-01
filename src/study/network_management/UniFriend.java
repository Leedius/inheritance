package study.network_management;

public class UniFriend extends Friend{
    private String major;

    public UniFriend(String name, String tell, String major){
        //super()안에 매개변수 name과 tell을 넣어서 friend클래스 생성자에 대입
        super(name, tell);
        this.major = major;
    }

    //상위클래스 Friend의 showInfo에 오버라이딩
    public void showInfo(){
        //상위클래스 Friend의 showInfo호출
        super.showInfo();
        System.out.println("전공 : " + major);
    }
}