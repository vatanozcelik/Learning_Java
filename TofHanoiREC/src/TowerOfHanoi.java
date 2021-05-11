public class App {
    public static void main(String[] args) {
        int value = 7;
        TowerOfHanoi(value, 'a','b','c');
    }
    public static void TowerOfHanoi(int value, char fromRod, char toRod, char auxRod){
        //System.out.println(value);

        if (value == 1) {
            System.out.println("move disk 1 from rod "+ fromRod+" to rod "+toRod);
            return;
        }
        TowerOfHanoi(value-1, fromRod, auxRod, toRod);
        System.out.println("move disk "+ value +" from rod "+ fromRod+ " to rod "+ toRod);
        TowerOfHanoi(value-1, auxRod, toRod, fromRod);
    }
}
