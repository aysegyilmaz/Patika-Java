import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();
        String unutulanSifre = "sifre123"; // Bu kısmı unutulan şifre ile değiştirin

        if (girilenSifre.equals(unutulanSifre)) {
            System.out.print("Yeni şifrenizi giriniz: ");
            String yeniSifre = scanner.nextLine();

            if (yeniSifre.equals(unutulanSifre)) {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu.");
            }
        } else {
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (Evet/Hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(unutulanSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }


    }
}
