public class Task implements Priority, Comparable<Task> {
    private String name;
    private int priority;
    private Status status;

    public Task(String name) {
        this.name = name;
        this.priority = Priority.MED_PRIORITY;
        this.status = Status.NOT_STARTED;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status.toString();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
