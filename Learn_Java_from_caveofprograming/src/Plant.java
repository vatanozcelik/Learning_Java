public class Plant {
    public String name;

    public final static int id = 7;

    private String type;

    protected String size;

    public Plant() {
        System.out.println("plant's constacture");
        this.name = "vATAN";
        this.type = "Plant";
        this.size = "medium";
    }
}
