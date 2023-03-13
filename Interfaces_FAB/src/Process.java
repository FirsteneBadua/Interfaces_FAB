public class Process implements Priority, Comparable<Process> {
    private String processID;
    private int priority;

    public Process(String processID) {
        this.processID = processID;
        this.priority = Priority.MED_PRIORITY;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public String getProcessID() {
        return processID;
    }

    @Override
    public int compareTo(Process other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Process{" +
                "processID='" + processID + '\'' +
                ", priority=" + priority +
                '}';
    }
}
