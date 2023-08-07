import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("Enter member count of fibonacci series: ");
                int memCount  = input.nextInt();

                int currentNum = 1;
                int previousNum = 0;
                int nextNum = currentNum + previousNum;

                System.out.print(previousNum + " " + currentNum + " ");
                for(int i = 2; i < memCount; i++)
                {
                    nextNum = currentNum + previousNum;
                    previousNum = currentNum;
                    currentNum = nextNum;
                    System.out.print(nextNum + " ");
                }
            }
        }