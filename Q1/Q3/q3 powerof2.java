import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        if (n >= 0 && n < 31) {
            for (int i = 0; i <=n; i++) {
                System.out.println("2^" + i + " = " + (1 << i));
            }
        } else {
            System.out.println("Please enter n between 0 and 30");
        }
    }
}
