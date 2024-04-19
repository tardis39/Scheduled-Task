package task;
public class MyTask implements Task {
    private int taskNumber;

    public MyTask(int taskNumber) {
        this.taskNumber = taskNumber;
    }
    @Override
    public void execute() {
        try {
            System.out.println("This is My Task getting started " + taskNumber);
            Thread.sleep(3000);
            System.out.println("My Task ended " + taskNumber);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
