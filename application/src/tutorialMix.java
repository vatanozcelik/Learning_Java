import java.util.Scanner;
public class tutorialMix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("please enter a commend: ");
        String text = input.nextLine();

        switch (text){
            case"start":
                System.out.println("machine started!");
                break;
            case"stop":
                System.out.println("machine stopped!");
                break;
            default:
                System.out.println("command not recognized");
        }

         */
        int[] values = new int[3];
        String[] words = new String[2];
        values[0] = 12;
        values[1] = 32;
        words[1] = "banana";
        String[] jobs = {"engineer", "doctor", "seller", "waiter"};
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        for (String job : jobs) {
            System.out.println(job);
        }
        String text = null;
        System.out.printf("this one is: %s ", text);

        // multi dimentional array
        int[][] numbers = {
                {4, 6, 8},
                {65, 32, 7},
                {43, 23, 76}
        };
        for (int j = 0; j < numbers.length; j = j + 1) {
            for (int i = 0; i < numbers[j].length; i = i + 1) {
                System.out.printf("%d \t", numbers[j][i]);
            }
        }
    }
}