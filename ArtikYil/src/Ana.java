import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = scanner.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 != 0 || (yil % 100 == 0 && yil % 400 == 0)) {
                artikYil = true;
            }
        }

        if (artikYil) {
            System.out.println(yil + " yılı bir artık yıldır.");
        } else {
            System.out.println(yil + " yılı bir artık yıl değildir.");
        }


    }
}
