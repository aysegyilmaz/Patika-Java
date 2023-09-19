import java.util.ArrayList;
import java.util.List;

public class BillService {
    private List<Bill> bills;

    public BillService() {
        this.bills = new ArrayList<>();
    }

    public void createBill(double amount, String processDate, int billType) {
        Bill bill = new Bill(amount, processDate, billType);
        bills.add(bill);
    }

    public Bill queryBill(String memberCode, int billType) {
        // MemberCode ve fatura tipine göre fatura sorgulama işlemi yapılabilir
        // Burada gerekli işlemleri gerçekleştirin
        return null; // Değiştirilecek
    }

    public void payBill(String memberCode, int billType, double amount, String processDate) throws InsufficientBalanceException, BillNotFoundException, MemberAccountNotFoundException {
        Bill bill = queryBill(memberCode, billType);
        MemberAccount memberAccount = null;// Üye hesabını sorgulayın

        if (bill == null) {
            throw new BillNotFoundException("Fatura bulunamadı.");
        }

        if (memberAccount == null) {
            throw new MemberAccountNotFoundException("Üye hesabı bulunamadı.");
        }

        if (memberAccount.getBalance() < amount) {
            throw new InsufficientBalanceException("Yetersiz bakiye.");
        }

        // Faturayı ödeme işlemi yapılabilir
        // Üye hesabının bakiyesini güncelleyin
    }

    public void cancelPayment(String memberCode, int billType, double amount, String processDate) throws InsufficientBalanceException, BillNotFoundException, MemberAccountNotFoundException {
        Bill bill = queryBill(memberCode, billType);
        MemberAccount memberAccount = null ;// Üye hesabını sorgulayın

        if (bill == null) {
            throw new BillNotFoundException("Fatura bulunamadı.");
        }

        if (memberAccount == null) {
            throw new MemberAccountNotFoundException("Üye hesabı bulunamadı.");
        }

        // Ödeme iptali işlemi yapılabilir
        // Üye hesabının bakiyesini güncelleyin
    }
}

