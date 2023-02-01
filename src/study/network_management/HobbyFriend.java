package study.network_management;

public class HobbyFriend extends Friend {
    private String hobby;

    public HobbyFriend(String name, String tell, String hobby){
        //super()안에 매개변수 name과 tell을 넣어서 Friend클래스 생성자에 대입
        super(name, tell);
        this.hobby = hobby;
    }

    //상위클래스 Friend의 showInfo에 오버라이딩
    public void showInfo(){
        //상위클래스 Friend의 showInfo호출
        super.showInfo();
        System.out.println("취미 : " + hobby);
    }
}

