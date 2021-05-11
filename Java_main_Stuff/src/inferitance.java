public class inferitance {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.start();

        Person person = new Person("bob");
        person.greet();

        Info info1 = new Machine();
        info1.showinfo();

        Info info2 = person;
        info2.showinfo();

        System.out.printf("\n\n<<  this is second way  >>\n\n");
        outputInfo(machine);
        outputInfo(person);
    }
    private static void outputInfo(Info info){
        info.showinfo();
    }
}

