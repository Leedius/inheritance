public class ManTest2 {
    public static void main(String[] args) {
        //상속 관계에서 생성자를 호출하면
        //생성자의 가장 첫 줄에 숨어 있는 super()가 실행 됨.
        //super()는 부모 클래스의 기본 생성자를 호출.
        //그래서 부모클래스에 기본 생성자가 없다면
        //자식 클래스의 생성자에서 오류가 발생.
        //이런 오류를 해결하기 위해선
        //1. 부모 클래스에 무조건 기본 생성자를 정의해주거나,
        //2. super()의 매개변수 정보를
        //부모 클래스의 생성자 매개변수 정보와 동일하게
        //호출을 해줘야 함.
        BusinessMan m1 = new BusinessMan();
    }
}
