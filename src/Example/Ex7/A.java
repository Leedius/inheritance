package Example.Ex7;

public class A {
    private int n;
    public int getN(){
        return n;
    }
    public void setN(int i){
        n = 1;
    }
}

class B extends A {
    public String s;
    //private int n;                //중복 제거
    public int m;
    private char c;
//    public void setN(int i){      //중복제거
//        n = 1;
//    }
    public void setC(char ch){
        c = ch;
    }
    public char getC(){
        return c;
    }
//    public int getN(){             //중복제거
//        return n;
//    }
}

class C extends B{
//    public String s;              //중복 제거
//    private char c;               //중복 제거
//    private int n;                //중복 제거
//    public int m;                 //중복 제거
    public double d;
//    public void setN(int i){      //중복제거
//        n=i;
//    }
//    public void setC(char ch){    //중복제거
//        c = ch;
//    }
//    public char getC(){           //중복제거
//        return c;
//    }
//    public int getN(){            //중복제거
//        return n;
//    }
}