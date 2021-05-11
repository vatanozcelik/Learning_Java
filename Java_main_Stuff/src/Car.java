public class Car extends Machine{
    public void showinfo(){
        System.out.println(name);
    }

    @Override
    public void start() {
        super.start();
    }

    public void wipe(){
        System.out.println("wiping.");
    }
}
