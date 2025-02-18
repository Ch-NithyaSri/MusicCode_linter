public class Event {

    private String eventID;
    private String eventName;
    private String dateTime;
    private String venue;
    private double price;
    private int availableSeats;
    private String genre;
    private int numberOfTickets;

    // Default Constructor
    public Event() {
        this.eventID = "";
        this.eventName = "";
        this.dateTime = "";
        this.venue = "";
        this.price = 0.0;
        this.availableSeats = 0;
        this.genre = "";
        this.numberOfTickets = 0;
    }

    // Parameterized Constructor
    public Event(String eventID, String eventName, String dateTime, String venue, double price, String genre, int numberOfTickets) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.dateTime = dateTime;
        this.venue = venue;
        this.price = price;
        this.genre = genre;
        this.numberOfTickets = numberOfTickets;
        this.availableSeats = numberOfTickets; // Assuming all tickets are available initially
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getEventID() {
        return this.eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getVenue() {
        return this.venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfTickets() {
        return this.numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // View Event Details
    public void viewEventDetails() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Event Name: " + eventName);
        System.out.println("Date & Time: " + dateTime);
        System.out.println("Venue: " + venue);
        System.out.println("Price: $" + price);
        System.out.println("Genre: " + genre);
        System.out.println("Available Seats: " + availableSeats);
    }

    // Check Ticket Availability
    public boolean checkAvailability() {
        return availableSeats > 0;
    }

    // Book a Ticket
    public boolean bookTicket(int ticketsToBook) {
        if (ticketsToBook <= availableSeats) {
            availableSeats -= ticketsToBook;
            System.out.println(ticketsToBook + " tickets booked successfully for " + eventName);
            return true;
        } else {
            System.out.println("Not enough tickets available.");
            return false;
        }
    }
}
