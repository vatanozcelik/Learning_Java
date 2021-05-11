class Machine {
    public Machine(){
        System.out.println("cons. of Machine");
    }
    public void start() {
        System.out.println("machine started.");
    }
}
class Camera extends Machine{
    public Camera(){
        System.out.println("cons. of camera");
    }
    public void start() {
        System.out.println("camera started.");
    }
    public void snap() {
        System.out.println("photo taken.");
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine = new Machine();
        Camera camera = new Camera();

        machine.start();
        camera.start();
        camera.snap();

        //Upcasting
        Machine machine1 = new Camera();
        machine1.start();
        // error: machine1.snap();

        //Downcasting
        Machine machine2 =new Camera();
        Camera camera1 = (Camera)machine2;
        camera1.start();
        camera1.snap();


    }
}
