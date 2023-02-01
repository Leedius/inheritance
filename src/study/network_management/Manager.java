package study.network_management;

//인맥관리 프로그램. 최대10명 저장가능.
//대학친구 UniFriend : 이름, 전공, 연락처
//직장동료 CompFriend : 이름, 부서, 연락처
public class Manager {
    public static void main(String[] args) {

        //대학친구 5명이 들어갈 공간 생성
        UniFriend[] ufs = new UniFriend[5];
        //직장친구 5명이 들어갈 공간 생성
        ComFriend[] cfs = new ComFriend[5];
        //동호회친구 5명이 들어갈 공간 생성
        HobbyFriend[] hfs = new HobbyFriend[5];


        //대학 친구 정보 등록
        int uniIndex = 0;
        //복습 ++이 뒤에 붙어있으면 한줄실행을 한 후 1증가 시킨다.
        ufs[uniIndex++] = new UniFriend("홍길동","010","경영");
        ufs[uniIndex++] = new UniFriend("김길동","010","컴공");


        //회사 동료 등록
        int compIndex = 0;
        cfs[compIndex++] = new ComFriend("김대리","011","영업부");
        cfs[compIndex++] = new ComFriend("이과장","010","인사부");


        //동호회 친구 등록
        int hobbyIndex = 0;
        hfs[hobbyIndex++] = new HobbyFriend("김대리","011","영업부");
        hfs[hobbyIndex++] = new HobbyFriend("이과장","010","인사부");


        //대학 친구 정보 출력
        for(int i = 0; i<uniIndex; i++){
            ufs[i].showInfo();
        }
        System.out.println();

        //직장 동료 정보 출력
        for(int i = 0; i<compIndex; i++){
            cfs[i].showInfo();
        }
        System.out.println();

        //동호회 친구 정보 출력
        for(int i = 0; i<hobbyIndex; i++){
            hfs[i].showInfo();
        }
    }
}
