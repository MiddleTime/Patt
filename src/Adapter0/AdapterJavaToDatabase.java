package Adapter0;

public class AdapterJavaToDatabase extends JavaAplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }


}
