public class TestApp {
    public static void main(String[] args) {
        // Testing User class
        User user = new User("john_doe", "john@example.com", "password123", "John Doe", "1234567890");
        user.addBooking(new Booking("B001", "Pending", "Concert", "Artist1", "Pop"));
        user.addBooking(new Booking("B002", "Pending", "Festival", "Artist2", "Rock"));
        user.viewBookings();

        // Testing Venue class
        Venue venue = new Venue();
        venue.setVenueName("Stadium");
        venue.setVenueLocation("New York");
        venue.setVenueCapacity(50000);
        System.out.println("Venue Details: " + venue.viewVenueDetails("Stadium"));
        System.out.println("Availability: " + venue.checkAvailability(100));

        // Testing Review class
        Review review = new Review("Great event!", 5);
        review.writeReview("Awesome show!");
        review.rateReview(5);
        System.out.println("Review: " + review.getReview());
        System.out.println("Rating: " + review.getRating());

        // Testing Payment class
        Payment payment = new Payment("Credit Card", 100.0);
        payment.setPaymentID("P001");
        payment.viewPaymentDetails("B001");
        System.out.println("Payment Status: " + payment.getStatus());

        // Testing Event class
        Event event = new Event("E001", "Rock Concert", "2025-02-20 19:00", "Stadium", 50.0, "Rock", 500);
        event.viewEventDetails();
        System.out.println("Availability: " + event.checkAvailability());
        event.bookTicket(2);

        // Testing Booking class
        Booking booking = new Booking("B001", "Pending", "Rock Concert", "Artist1", "Rock");
        System.out.println(booking.viewBookingDetails("john_doe"));
        booking.confirmBooking("B001");
        System.out.println(booking.viewBookingDetails("john_doe"));

        // Testing Artist class
        Artist artist = new Artist("Artist1", "Rock");
        artist.viewArtistDetails("Artist1");    }
}
