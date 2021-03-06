package command0;


public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database)
        );
        developer.insertRecord();
        developer.updateRecord();
    }
}
