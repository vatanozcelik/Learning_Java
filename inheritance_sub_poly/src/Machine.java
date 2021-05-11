public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void start();
    public abstract void doStaff();
    public abstract void shutdown();

    public void run(){
        start();
        doStaff();
        shutdown();
    }
}
