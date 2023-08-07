import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find prime numbers until that number: ");
        int num = input.nextInt();

        for(int i = 2; i <= num; i++) //until that number
        {
            int factorCount = 0;
            for(int i2= 2; i2<i; i2++) //check if that number has any factor
            {
                if(i % i2 == 0) factorCount++;
            }

            if(factorCount == 0) System.out.print(i + " ");
        }
    }
}