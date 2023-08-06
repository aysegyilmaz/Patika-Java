import java.util.Scanner;

public class Ana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Sayı Giriniz: ");
        n = input.nextInt();

        for ( int i= 1; i<n; i++){
                System.out.println("4^" + i + " = " + Math.pow(4, i));
                System.out.println("5^" + i + " = " + Math.pow(5, i));
        }



    }
}
