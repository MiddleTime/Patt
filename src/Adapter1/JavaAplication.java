package Adapter1;

//у базы данных одни методы, а у JavaAplication - другие...
public class JavaAplication {
    public void saveObject() {
        System.out.println("Saving ...");
    }

    public void updateObject() {
        System.out.println("updating...");
    }

    public void loadObject() {
        System.out.println("loading...");
    }

    public void deleteObject() {
        System.out.println("deleting...");
    }
}

