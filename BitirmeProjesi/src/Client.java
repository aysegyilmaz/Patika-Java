import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        BillService billService = new BillService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üye kodunu girin: ");
        String memberCode = scanner.nextLine();

        System.out.println("Fatura tipini girin (1-Telefon, 2-Internet, 3-Su): ");
        int billType = scanner.nextInt();

        // Fatura işlemlerini çağırın
        try {
            double amount = 0;
            String processDate;
            processDate = null;
            billService.payBill(memberCode, billType, amount, processDate);
            // veya
            billService.cancelPayment(memberCode, billType, amount, processDate);
        } catch (InsufficientBalanceException e) {
            System.out.println("Hata: " + e.getMessage());
        } catch (MemberAccountNotFoundException e) {
            throw new RuntimeException(e);
        } catch (BillNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void run() {
    }
}
