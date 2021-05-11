public class App {
    public static void main(String[] args) {
        // private static final String Dog;
        // private static final String Cat;
        /* to avoid from above we use enum.. */
        Animal animal = Animal.DOG;

        switch (animal){
            case CAT:
                System.out.println("cAT");
                break;
            case DOG:
                System.out.println("dog");
                break;
            default:
                break;
            }

        System.out.println(Animal.DOG);
        System.out.println("enum name as a string "+ Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.MOUSE.getName());
        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
