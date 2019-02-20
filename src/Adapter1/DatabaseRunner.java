package Adapter1;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.delete();
    }
}
