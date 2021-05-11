public class Car extends Machine{
    @Override
    public void start() {
        System.out.println("starting car.");
    }

    @Override
    public void doStaff() {
        System.out.println("do staff in car.");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown in car.");
    }
}
