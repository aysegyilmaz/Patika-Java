package Kombinasyon;

import java.util.Scanner;


public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını Giriniz: ");
        int n = input.nextInt();

        System.out.print("r sayısını giriniz: ");
        int r = input.nextInt();

        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;

        }
        int res = 1;
        for (int i = 1; i <= r; i++) {
            res *= i;

        }
        int a = 1;
        for (int i = 1; i <= (n - r); i++) {
            a *= i;

        }
        int com = (total / (res * a));
        System.out.println(n + " sayısının "+ r + " ile kombinasyonu = " + com);

    }
}
