import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import task.MyTask;
import task.ScheduledTask;
import task.Task;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        Task task0 = new MyTask(0);
        Task task1 = new MyTask(1);
        Task task2 = new MyTask(2);
        scheduledExecutorService.schedule(new ScheduledTask(task0), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new ScheduledTask(task1), 1, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new ScheduledTask(task2), 1, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}