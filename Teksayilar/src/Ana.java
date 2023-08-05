import java.util.Scanner;

public class Ana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.print("Sayı Giriniz: ");
            n = input.nextInt();
            if (n % 2 == 0 || n % 4 == 0) {
                sum += n;
                System.out.println("Sayıların toplamı: " + sum);

            }
        }while (n % 2 == 0) ;

    }
}
