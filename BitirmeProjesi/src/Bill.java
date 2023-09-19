public class Bill {
    private double amount;
    private String processDate;
    private int billType;

    public Bill(double amount, String processDate, int billType) {
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
    }

    // Getter metotları
    public double getAmount() {
        return amount;
    }

    public String getProcessDate() {
        return processDate;
    }

    public int getBillType() {
        return billType;
    }

    // Setter metotları
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setProcessDate(String processDate) {
        this.processDate = processDate;
    }

    public void setBillType(int billType) {
        this.billType = billType;
    }
}
