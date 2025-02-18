public class Payment {

    private String paymentID;
    private double amount;
    private String paymentType;
    private String status;

    // Corrected Constructor (No Return Type)
    public Payment(String paymentType, double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
        this.status = "Pending"; // Default status
    }

    // Corrected viewPaymentDetails method
    public void viewPaymentDetails(String bookingID) {
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Payment ID: " + paymentID);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Type: " + paymentType);
        System.out.println("Status: " + status);
    }

    public String getPaymentID() {
        return this.paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
