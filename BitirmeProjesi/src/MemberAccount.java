public class MemberAccount {
    private int id;
    private String firstName;
    private String lastName;
    private String code;
    private double balance;

    public MemberAccount(int id, String firstName, String lastName, String code, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.code = code;
        this.balance = balance;
    }

    // Getter metotları
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCode() {
        return code;
    }

    public double getBalance() {
        return balance;
    }

    // Setter metotları
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
