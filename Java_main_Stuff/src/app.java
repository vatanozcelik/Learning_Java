class frog {

    private int id;
    private String name;
    public frog(){

    }
    public frog(int id, String name) {
        this.id = id;
        this.name = name;
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        System.out.println(sb.toString());

    }

    public String toString() {
        return String.format("id: %d and name is: %s",id,name);
/*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
    }
 */
    }
}
    public class app {
        public static void main(String[] args) {
            frog frog1 = new frog(1,"nedenki!!");
            frog frog2 = new frog(7,"vatan");

            System.out.println(frog2);
            Machine mach = new Machine();
            mach.start();
            mach.stop();
            Car car = new Car();
            System.out.println("car.start won't work out cause its @Overriden now :)\nyou are gonna be machine started below:");
            car.start();
            car.wipe();
            car.stop();
            car.showinfo();


        }
    }

