import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        float mesafe = scanner.nextFloat();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): " );
        int tip = scanner.nextInt();

        float normal_tutar = mesafe * 0.10f;

        switch (tip){
            case 1:
                if (yas<12){
                    float yas_indirimii = normal_tutar * 0.5f;
                    float indirimlii = (normal_tutar-yas_indirimii);
                    System.out.println("Toplam tutar: "+ indirimlii);
                } else if (12<yas && yas<24) {
                    float yas_indirimii2 = normal_tutar*0.1f;
                    float indirimlii2 = (normal_tutar-yas_indirimii2);
                    System.out.println("Toplam tutar: " + indirimlii2);
                    
                } else if (yas>65) {
                    float yas_indirimii3 = normal_tutar * 0.3f;
                    float indirimlii3 = (normal_tutar-yas_indirimii3);
                    System.out.println("Toplam tutar: "+ indirimlii3);

                }else {
                    System.out.println("Toplam tutar: " + normal_tutar);
                }
                break;
            case 2:
                if (yas<12){
                    float yas_indirimi = normal_tutar * 0.5f;
                    float indirimli = (normal_tutar-yas_indirimi);
                    float gidis1 = indirimli * 0.2f;
                    float toplam1 = (indirimli-gidis1)*2;
                    System.out.println("Toplam tutar: "+ toplam1);

                } else if (12<yas && yas<24) {
                    float yas_indirimi2 = normal_tutar*0.1f;
                    float indirimli2 = (normal_tutar-yas_indirimi2);
                    float gidis2 = indirimli2 * 0.2f;
                    float toplam2 = (indirimli2-gidis2)*2;
                    System.out.println("Toplam tutar: " + toplam2);

                } else if (yas>65) {
                    float yas_indirimi3 = normal_tutar * 0.3f;
                    float indirimli3 = (normal_tutar-yas_indirimi3);
                    float gidis3 = indirimli3 * 0.2f;
                    float toplam3 = (indirimli3-gidis3)*2;
                    System.out.println("Toplam tutar: "+ toplam3);

                }else{
                    System.out.println("Toplam tutar: " + normal_tutar*2);
                }
                break;
            default:
                System.out.println("Hatalı veri girişi!");





        }



    }
}
