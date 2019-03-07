
package Composite1;


public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        
        Developer javaDeveloper = new JavaDeveloper();
        Developer phpDeveloper = new PhpDeveloper();
        
        team.addDeveloper(javaDeveloper);
        team.addDeveloper(phpDeveloper);
        
        team.createProject();
        
    }
}
