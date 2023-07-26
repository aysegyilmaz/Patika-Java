import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gün giriniz: ");
        int day = input.nextInt(); ;


        switch (day) {
            case 1:
                    System.out.println("Bugün Pazartesi");
                System.out.println("Program Bitti");
                break;
            case 2:
                System.out.println("Bugün Salı");
                break;
            case 3:
                System.out.println("Bugün Carşamba");
                break;
            default:
                System.out.println("Hatali giriş yaptınız");
    }
}

}
