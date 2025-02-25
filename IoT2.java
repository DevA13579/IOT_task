import java.util.Scanner;

public class IoT2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int countT = 0, countS = 0;

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine().toLowerCase();

            for (char c : text.toCharArray()) {
                if (c == 't') countT++;
                if (c == 's') countS++;
            }
        }

        if (countT > countS) {
            System.out.println("English");
        } else {
            System.out.println("French");
        }

        scanner.close();
    }
}
