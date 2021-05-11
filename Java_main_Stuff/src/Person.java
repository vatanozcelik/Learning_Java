public class Person implements Info{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void greet(){
        System.out.println("hello there!");
    }

    @Override
    public void showinfo() {
        System.out.println("person's name is "+name);
    }
}
