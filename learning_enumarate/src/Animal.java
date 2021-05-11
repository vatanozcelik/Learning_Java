public enum Animal {
    DOG("alex"), CAT("tom"), MOUSE("jerry");

    private String name;
    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return "this is getname method " + name;
    }
    public String toString(){
        return "<< toString>> this animal is called " + name;
    }
}
