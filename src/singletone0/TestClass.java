package Singletone0;

public class TestClass {
    public static void main(String[] args) {
        //как создать экземпляр нашего класса
        MyObject o = new MyObject();

        //создать еще один экземпляр
        MyObject o2 = new MyObject();

        //можно сколько угодно создавать объектов

        //создать экземпляр закрытого класса
       // MyObjectClosed0 o3 = new MyObjectClosed0(); //нельзя создать объект по этому классу. Почему?

        MyObjectClosed1 o4 = MyObjectClosed1.getInstance();

        MyObjectClosed1 o5 = MyObjectClosed1.getInstance();  //снова можем создать сколько угодно объектов...

        Singletone s1 = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance(); //пытаемся создать второй экземпляр 
        
    }
}
