
package Proxy0;

public class ProjectRunner {
    public static void main(String[] args) {
        
    Project project = new  RealProject("https://www.github/me/myProject.git");
    
    project.run();
    }
    
}
