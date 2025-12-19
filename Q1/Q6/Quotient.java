import java.util.Scanner;

public class quotient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero");
            return;
        }

        int quot= dividend / divisor;
        int rem= dividend % divisor;

        System.out.println("Quotient = " + quot);
        System.out.println("Remainder = " + rem);
    }
}
