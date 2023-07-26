import java.util.Scanner; // kullanıcıdan veri almak için gerekli kütüphane


public class degisken {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //scaner kütüphanesinin çalişması için gerekli sınıf

        System.out.print("A sayını giriniz : ");
        int a = input.nextInt ();
        System.out.println(a);
    }
}
