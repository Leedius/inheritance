package study.ex7;

public class AnimalManage {
    public static void main(String[] args) {
        //강아지, 고양이를 저장 할 공간을 부모인 Ani클래스에
        // 5개의 공간배열을 만듬.
        Ani[] cages = new Ani[5];

        cages[0] = new Cat();
        cages[1] = new Cat();
        cages[2] = new Puppy();
        cages[3] = new Puppy();
        cages[4] = new Puppy();

        for(int i = 0; i<cages.length; i++){
            cages[i].sound();
        }
    }
}
