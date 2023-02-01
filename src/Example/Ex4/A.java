package Example.Ex4;

public class A {
    private int x;
    private int y;

    //A클래스의 기본 생성자 생성
    public A(){
        x=1;
        y=1;
    }

    //A클래스의 매개변수 정수 x를 받는 생성자 생성
    public A(int x){
        this.x = x;
        this.y = 1;
    }

    //A클래스의 매개변수 정수 x,y 두개 를 받는 생성자 생성
    public A(int x, int y){
        this.x = x;
        this.y = y;
    }

    //A클래스의 x, y 값을 출력하는 메소드  disp1
    public void disp1(){
        System.out.print(" x = " + x + ", y = " + y);
    }
}

//A클래스를 B클래스에 상속
class B extends A{
    private int x;
    private int y;

    //B클래스 기본 생성자 생성
    public B(){
        this.x = 1;
        this.y = 1;
    }

    //B클래스에 매개변수 정수 x를 받는 생성자 생성
    public B(int x){
        //매개변수 x를 부모 클래스 A클래스에 전달 호출
        super(x);
        this.x = 1;
        this.y = 1;

    }

    //B클래스에 매개변수 정수 x,y 두 개를 받는 생성자 생성
    public B(int x, int y){
        //매개변수 x,y 두 개를 부모 클래스 A클래스에 전달 호출
        super(x,y);
        this.x = 1;
        this.y = 1;

    }

    //B클래스에 매개변수 정수 x,y,a 세 개를 받는 생성자 생성
    public B(int x, int y, int a){
        super(x,y);
        this.x = a;
        this.y = 1;

    }

    //B클래스에 매개변수 정수 x,y,a,b 세 개를 받는 생성자 생성
    public B(int x, int y, int a, int b){
        super(x,y);
        this.x = a;
        this.y = b;
    }


    public void disp(){
        disp1();
        System.out.println(", x = "+x+", y = "+y);
    }
}