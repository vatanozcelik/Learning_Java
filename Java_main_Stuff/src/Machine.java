public class Machine implements Info {

    private int id = 7;
    public String name = "name in machine but called by car subclass\n" +
            "and if i declare it as private, its gonna be invisible\n" +
            "and i can see clearly by protected as well.\n" +
            "by the default we can see clearly as well. ";


    public void start() {
        System.out.println("Machine started.");
    }
    public void stop() {
        System.out.println("Machine stopped.");
    }

    @Override
    public void showinfo() {
        System.out.println("override! and machine ID is: "+ id);
    }
}
