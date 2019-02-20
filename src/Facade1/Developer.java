package Facade1;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is working on project...");
        }else {
            System.out.println("Developer is reading Oracle docs...");
        }
    }
}
