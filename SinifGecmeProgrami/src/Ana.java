import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunu Giriniz: ");
        float d1 = scanner.nextFloat();

        System.out.print("Fizik Notunu Giriniz: ");
        float d2 = scanner.nextFloat();

        System.out.print("Türkçe notunu Giriniz: ");
        float d3 = scanner.nextFloat();

        System.out.print("Kimya notunu Giriniz: ");
        float d4 = scanner.nextFloat();

        System.out.print("Müzik notunu Giriniz: ");
        float d5 = scanner.nextFloat();
        
        float avg = (d1+d2+d3+d4+d5)/5;
        System.out.println(avg);

        if (avg >= 55){
            System.out.println("Sınıfı Geçtiniz.");
        }else if (avg < 55){
            System.out.println("Sınıfı Geçemediniz.");
            
        }else if ( avg < 0 && avg>100){
            System.out.println("Ortalamaya katılamadı.");
        }

    }
}
