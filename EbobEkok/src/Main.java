import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextByte();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob=1;
        int i =1;
        /*for(int i =1; i<=n1; i++){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }

       }*/
        do{
            i++;
            if(n1%i==0 && n2%i==0) {
                ebob = i;
            }


        }while (i <=n1);

        System.out.println(n1+" ve "+n2 +" sayılarının ebobu = " + ebob);

        int ekok = (n1*n2)/ebob;
        System.out.println(n1+" ve "+n2 +" sayılarının ekoku = " + ekok);
    }
}