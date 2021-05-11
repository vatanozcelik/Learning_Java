public class App {
    public static void main(String[] args) {
        Robot robot = new Robot(7);
        robot.start();

        // it is worked just when class is public
        /*
        Robot.brain brain2 = robot.new brain();
        brain2.think();

 */
        // very commanly used..
        Robot.battery battaryy = new Robot.battery();
        battaryy.charge();
    }
}
