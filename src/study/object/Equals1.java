package study.object;

public class Equals1 {
    String name;
    int age;

    public Equals1(String name, int age){
        this.name = name;
        this.age = age;
    }

    //이름과 나이가 같은 객체면 동일한 객체.
    @Override
    //오버라이딩할때는 매개변수(Object obj) 변경 불가
    //Object obj -> 매개변수로 무엇이든 전달 가능.
    public boolean equals(Object obj) {

        //상위클래스 Object에는 age가 없고
        //하위클래스 Equals1에 age가 있기때문에
        //형변환을해줘야 age를 사용가능.
        //Object o를 Equals1 e로 형변환
        Equals1 e = (Equals1)obj;
        if(name.equals(e.name) && age == e.age){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Equals1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
