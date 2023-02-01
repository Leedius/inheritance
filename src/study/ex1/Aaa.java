package study.ex1;

//자바는 다중 상속을 지원하지 않습니다.
//하지만 다중 상속을 한 것처럼 클래스를 구현 할 수 있다.
public class Aaa {
    int a;
    //상속을 준다고 하여도 private 변수는 하위 클래스에선 접근 불가
    private int aaa;

    //protected : private + 하위(자식)클래스까지 사용 허용
    protected int a1;
}

class Bbb extends Aaa{
    int b;

    public void bbb(){
        a = 10;
        //private으로 선언된 변수이기 때문에 사용 불가.
        //aaa=10;
        a1 = 10;
    }
}

//Ccc클래스의 부모 클래스 Bbb클래스에도 부모 클래스 Aaa클래스가 있기 떄문에
//Ccc클래스에서 최상위 부모클래스 Aaa클래스의 내용을 가진다.
class Ccc extends Bbb{
    int c;
}

