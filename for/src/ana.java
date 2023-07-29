import java.util.Scanner;

public class ana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int sayi = input.nextInt();
        int sum = 0;
        int count = 0;
        for(int i =0; i<sayi; i++){
            if (i%3==0 || i%4==0){
                sum += i;
                count++;
            }
        }
        System.out.println("Sayıların ortalaması:"+sum/count);
    }
}
