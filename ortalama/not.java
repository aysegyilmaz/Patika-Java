import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Armut kaç kilo? : ");
        float armut = input.nextFloat();
        System.out.println(armut);

        System.out.print("Elma kaç kilo? : ");
        float elma = input.nextFloat();
        System.out.println(elma);

        System.out.print("Domates kaç kilo? : ");
        float domates = input.nextFloat();
        System.out.println(domates);

        System.out.print("Muz kaç kilo? : ");
        float muz = input.nextFloat();
        System.out.println(muz);

        System.out.print("Patlıcan kaç kilo? : ");
        float patlican = input.nextFloat();
        System.out.println(patlican);

        System.out.print("Toplam tutar? : ");
        float toplam = elma + domates + muz + patlican + armut
        System.out.println(toplam);

    }
}
