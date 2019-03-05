
package Iterator1;


public class DeveloperRunner {
    public static void main(String[] args) {
        String[] javaSkills = {"Java basic", "Spring", "Hibernate", "Maven", "PosgreSQL","Docker"};
        
        Developer javaDeveloper = new Developer("Nikolai Smirnov", javaSkills);
        
       String[] phpSkills = {"php basic", "Laravel", "Vuee", "PosgreSQL","Docker"};
        Developer phpDeveloper = new Developer("Aleksei Ivanov", phpSkills);
        
        
        Iterator iterator1 = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");
        
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next().toString() + " ");
            
        }
        
        System.out.println("\n====================================");
        Iterator iterator2 = phpDeveloper.getIterator();
        System.out.println("Developer: " + phpDeveloper.getName());
        System.out.print("Skills: ");
        
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next().toString() + " ");
            
        }
    }
    
}
