package Singletone0;

public class Singletone {
    //переменная для хранения единственного экземпляра этого класса
    public static Singletone uniqueInstance;

    //приватный конструктор  (означет что только этот класс может создавать экземпляры этого класса)
    private Singletone(){

    }
    //отложенное создание объекта (только если действительно нужно). В отличии от глобальной переменной.
    public static Singletone getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new Singletone();
            System.out.println("The new instance of Singlatone");
        }
        System.out.println("Returning instance...");
        return uniqueInstance;
    }

}

