package command0;


public class Developer {
    Command insert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command insert, Command update) {
        this.insert = insert;
        this.update = update;
    }

    public void insertRecord(){
        insert.execute();
    }
    public void updateRecord(){
        update.execute();
    }
}
