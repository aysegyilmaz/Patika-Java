import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int total = 0;
        for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                total += i;
            }
        }

        if(total == number) System.out.println("Your number is perfect number!");
        else System.out.println("Your number is not perfect number!");
    }
}