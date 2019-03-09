
package Proxy1;


public class ProjectRunner {
    public static void main(String[] args) {
        
    Project project = new  ProxyProject("https://www.github/me/myProject.git");
    
    project.run();
    }
    
}
