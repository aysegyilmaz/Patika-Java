import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi, sayi / 2)) {
            //asalMi(sayi, sayi / 2) ifadesi, asalMi metodu çağrılırken sayının kendisi ve bölüneceği en büyük böleni (kendisinin yarısı) parametre olarak verilir.
            System.out.println(sayi + " asal bir sayıdır.");
        } else {
            System.out.println(sayi + " asal bir sayı değildir.");
        }
    }

    // Recursive metot ile asal kontrolü
    public static boolean asalMi(int sayi, int bolen) {
        if (bolen == 1) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return asalMi(sayi, bolen - 1);
    }
}
