import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numCount = 1;
        do {
            if(numCount <= 0) System.out.println("You entered incorrect data!");

            System.out.print("How many numbers you wanna enter: ");
            numCount = input.nextInt();
        }while(numCount < 0);

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i = 0; i < numCount; i++)
        {
            System.out.print("Enter a number: ");
            int currentNum = input.nextInt();
            if(currentNum > maxNum) maxNum = currentNum;
            if(currentNum < minNum) minNum = currentNum;
        }

        System.out.println("Max number is: " + maxNum + "\nMin number is: " + minNum);
    }
}