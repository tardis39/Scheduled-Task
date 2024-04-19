package task;
public class ScheduledTask implements Runnable {
    private Task task;
    public ScheduledTask(Task task) {
        this.task = task;
    }
    @Override
    public void run() {
        task.execute();
    }
}
