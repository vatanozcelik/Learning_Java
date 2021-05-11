public class App {

    public static void main(String[] args) {
        // ==========================================
        App app = new App();
        int value = 7;
        System.out.println("1 main value is: "+ value );
        app.showing(value);
        System.out.println("2 main value is: "+ value );
        //===========================================
        System.out.println("\n");
        Person person = new Person("bob");

        System.out.println("1 "+ person);
        app.showing(person);
        //person.setName("biz");
        System.out.println("4 "+ person);

    }
    public void showing(int value) {
        System.out.println("value is :" + value );
        value = 8;
        System.out.println(value);
    }
    public void showing(Person person){
        System.out.println("2: "+person);
        person.setName("siz");
        person = new Person("Richard");
        System.out.println("3: "+person);
    }
}
