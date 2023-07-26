import java.util.Scanner;

//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class Ana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen a sayısını giriniz: ");
        int a = scan.nextInt();
        System.out.print("Lütfen b sayısını giriniz: ");
        int b = scan.nextInt();
        System.out.print("Lütfen c sayısını giriniz: ");
        int c = scan.nextInt();

        if ((a>b) && (a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        } else if ((b>a) && (b>c)){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else {
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }

        scan.close();
    }
}
