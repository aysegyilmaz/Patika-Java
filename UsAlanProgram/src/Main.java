import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        int sonuc = power(taban, us);
        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close();
    }

    public static int power(int taban, int us) {
        if (us == 0) {
            return 1; // Herhangi bir sayının 0 üssü 1'dir
        } else {
            return taban * power(taban, us - 1);
        }
    }
}

