import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("n sayısını giriniz: ");
        int n = input.nextInt();
        double res = 0.0;


        for (double i = 1; i<=n; i++){
            res += (1/i);
        }


        System.out.println(res);
    }
}