package Facade0;

public class SpringRunner {
    public static void main(String[] args) {
        //получился сложный код, трудно читаемый. Но рабочий...

        Job job = new Job();
        job.doJob();

        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();

        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

}
