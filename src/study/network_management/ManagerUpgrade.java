package study.network_management;

public class ManagerUpgrade {
    public static void main(String[] args) {
        Friend[] fs = new Friend[10];

        int index = 0;

        fs[index++] = new UniFriend("김","0","과");
        fs[index++] = new UniFriend("이","0","과");
        fs[index++] = new ComFriend("이","0","과");
        fs[index++] = new ComFriend("이","0","과");
        fs[index++] = new HobbyFriend("이","0","과");

        for(int i = 0; i<index; i++){
            fs[i].showInfo();
        }
    }

}
