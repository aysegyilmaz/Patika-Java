import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        recursiveIslem(n, n);
    }

    public static void recursiveIslem(int n, int original) {
        if (n <= 0) {
            System.out.println(n);
            recursiveEkle(n, original);
        } else {
            System.out.println(n);
            recursiveIslem(n - 5, original);
        }
    }

    public static void recursiveEkle(int n, int original) {
        if (n >= original) {
            System.out.println(n);
        } else {
            System.out.println(n);
            recursiveEkle(n + 5, original);
        }
    }
}

