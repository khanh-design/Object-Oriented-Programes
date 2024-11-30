package StopWatch;

public class Watch {
    private long startTime;
    private long endTime;

    public Watch() {
        this.startTime = System.currentTimeMillis();
    }


    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start()  {
        this.startTime = System.currentTimeMillis();
    }

    public void stop()  {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
