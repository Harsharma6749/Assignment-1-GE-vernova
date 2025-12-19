import java.util.Scanner;

public class flipcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of times to flip coin: ");
        int n = sc.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < n; i++) {
            double r = Math.random();
            if (r < 0.5)
                tails++;
            else
                heads++;
        }

        System.out.println("Heads Percentage: " +(heads * 100.0 / n));
        System.out.println("Tails Percentage: " +(tails * 100.0 / n));
    }
}
