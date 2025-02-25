import java.util.Scanner;

public class IoT2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int count_T = 0;
        int count_S = 0;

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine().toLowerCase();

            for (char c : text.toCharArray()) {
                if (c == 't'){
                    count_T++;
                }
                if (c == 's') {
                    count_S++;
                }
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
