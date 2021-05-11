package newPackage;
public class w3schools {
    int x = 5;
    public w3schools(){
        x = 3;
        System.out.println("constructor: "+x);
    }
    public void myMethod(){
        System.out.println("hello 3amoglu");
    }
    public static void main(String[] args) {
         /*the class should not be inherited by other class
         final class myclass */
        /* int day = 4;
        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
        } */
        /* the car class should inherit
        class car extends vehicle */
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally
        {
            System.out.println("The 'try catch' is finished.");
        }
        int x = 3;
        w3schools w3 = new w3schools();
        System.out.println(w3.x);
        w3schools myObj = new w3schools();
        myObj.myMethod();
    }
}
