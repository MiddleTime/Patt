package Facade0;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint(){
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Strint is active...");
        activeSprint = true;
    }

    public void finishSprint(){
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
