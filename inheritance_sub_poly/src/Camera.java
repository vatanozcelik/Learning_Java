public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("starting camera.");
    }

    @Override
    public void doStaff() {
        System.out.println("dostaff in camera.");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown camera.");
    }
}
