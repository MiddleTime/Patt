package Singletone0;

public class MyObjectClosed1 {
    private MyObjectClosed1(){

    }
    public static MyObjectClosed1 getInstance(){

        return new MyObjectClosed1();
    }
}

