public class Robot {
    private int id;

    public Robot(int id) {
        this.id = id;
    }
    private class brain {
        public void think() {
            System.out.println("i am still thinking..");
        }
    }
    // by static i can reach to id ....
    public static class battery {
        public void charge() {
            System.out.println("battary is charging..");
        }
    }
    public void start() {
        System.out.println("robot starting...");

        brain brain1 = new brain();
        brain1.think();

        final String name = "Vatan";
        // we can not name it public or private this class cause it is subclass of start class...
        class temp {
            public void doSomething() {
                System.out.println("my " + id );
                System.out.println("my name is " + name);
            }
        }
        temp tempp = new temp();
        tempp.doSomething();
    }
}
