import java.time.LocalDateTime;

public class Booking {

    private String bookingID;
    private String paymentStatus;
    private String eventName;
    private String artistName;
    private String musicStyle;
	private String venueName;
    private double price;
    private LocalDateTime dateTime;
    private String venueLocation;

    public Booking() {
        this.bookingID = "";
        this.paymentStatus = "";
        this.eventName = "";
        this.artistName = "";
        this.musicStyle = "";
    }

    public Booking(String bookingID, String paymentStatus, String eventName, String artistName, String musicStyle) {
        this.bookingID = bookingID;
        this.paymentStatus = paymentStatus;
        this.eventName = eventName;
        this.artistName = artistName;
        this.musicStyle = musicStyle;
    }

    public String confirmBooking(String bookingID) {
        if (this.bookingID.equals(bookingID)) {
            this.paymentStatus = "Confirmed";
            return "Booking confirmed for ID: " + bookingID;
        }
        return "Booking ID not found.";
    }

    public String viewBookingDetails(String userName) {
        return "Booking details for user " + userName + ": " +
               "\nBooking ID: " + this.bookingID +
               "\nPayment Status: " + this.paymentStatus +
               "\nEvent Name: " + this.eventName +
               "\nArtist Name: " + this.artistName +
               "\nMusic Style: " + this.musicStyle;
    }

    public String getBookingID() {
        return this.bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getMusicStyle() {
        return this.musicStyle;
    }

    public void setMusicStyle(String musicStyle) {
        this.musicStyle = musicStyle;
    }

    public String getVenueName() {
        return this.venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getVenueLocation() {
        return this.venueLocation;
    }

    public void setVenueLocation(String venueLocation) {
        this.venueLocation = venueLocation;
    }
}
