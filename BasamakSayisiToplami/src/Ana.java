import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int temp = sayi;

        while (temp != 0) {
            toplam += temp % 10;
            temp /= 10;
        }

        System.out.println("Basamakların toplamı: " + toplam);
    }
}
