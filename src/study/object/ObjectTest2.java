package study.object;

public class ObjectTest2 {
    public static void main(String[] args) {
        ToStringTest t1 = new ToStringTest();


        String result1 = t1.toString();
        System.out.println(result1);

        //위 두줄 코드랑 똑같은 코드
        System.out.println(t1.toString());
        //위의 코드랑 같은 코드
        //객체명을 출력하면 자동으로
        //객체명 뒤에 . toString()이 붙어서 실행
        System.out.println(t1);
    }
}
