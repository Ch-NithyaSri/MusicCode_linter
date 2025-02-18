import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String emailID;
    private String password;
    private String name;
    private String phone;
    private List<Booking> bookings; // List to store bookings

    public User(String userName, String emailID, String password, String name, String phone) {
        this.userName = userName;
        this.emailID = emailID;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.bookings = new ArrayList<>(); // Initialize the bookings list
    }

    // Method to add a booking for the user
    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    // View all bookings with detailed information
    public void viewBookings() {
        System.out.println("Bookings for user: " + userName);
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            for (Booking booking : bookings) {
                System.out.println("Artist: " + booking.getArtistName());
                System.out.println("Venue: " + booking.getVenueName());
                System.out.println("Location: " + booking.getVenueLocation());
                System.out.println("Price: $" + booking.getPrice());
                System.out.println("Date and Time: " + booking.getDateTime());
                System.out.println("------------------------------");
            }
        }
    }

    // Getters and Setters
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailID() {
		return this.emailID;
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
