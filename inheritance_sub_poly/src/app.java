public class app {
    public static void main(String[] args) {
        Camera camera1 = new Camera();

        camera1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

        car1.run();
        camera1.run();

        //Machine machine1 = new Machine();

    }

}
