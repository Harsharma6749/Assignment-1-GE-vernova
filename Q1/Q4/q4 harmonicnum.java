import java.util.Scanner;

public class harmonicnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("N must be greater than 0");
            return;
        }

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Harmonic value of " + n + " = " + sum);
    }
}
