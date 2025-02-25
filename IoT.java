import java.util.Scanner;

public class IoT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine().toLowerCase();

        int count_T = 0;
        int count_S = 0;
        for (char c : text.toCharArray()) {
            if (c == 't') {
                count_T= count_T+1;
            }
            if (c == 's') {
                count_S = count_S + 1;
            }
        }

        if (count_T > count_S) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }

        scanner.close();

    }


}
