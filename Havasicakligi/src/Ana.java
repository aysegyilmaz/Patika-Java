import java.util.Scanner;

public class Ana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");

        int heat = scan.nextInt();

        if(heat<5){
            System.out.println("Kayak yapınız");
        }else if (heat<=15){
            System.out.println("Sinemaya gidiniz");
        }else if (heat<=25){
            System.out.println("Piknik yapınız");
        }else {
            System.out.println("Yüzmeye gidiniz");
        }



    }
}
