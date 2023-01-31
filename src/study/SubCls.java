package study;

public class SubCls extends SuperCls {
//    자동으로 만들어지는 생성자
//    public SubCls(){
//      super();
//    }

    //SubCls 기본 생성자 생성
    public SubCls(){
        System.out.println("서브 생성자1");
    }

    public SubCls(int a){

        //super에 매개변수 2개가 있기때문에 부모 클래스에서 매개변수 2개를 받는 생성자가 실행
        super(5,3);
        System.out.println("서브 생성자2");
    }
}
