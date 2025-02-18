public class Venue {

	private String venueName;
	private String venueLocation;
	private int venueCapacity;

	public String getVenueName() {
		return this.venueName;
	}

	/**
	 * 
	 * @param venueName
	 */
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getVenueLocation() {
		return this.venueLocation;
	}

	/**
	 * 
	 * @param venueLocation
	 */
	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}

	public int getVenueCapacity() {
		return this.venueCapacity;
	}

	/**
	 * 
	 * @param venueCapacity
	 */
	public void setVenueCapacity(int venueCapacity) {
		this.venueCapacity = venueCapacity;
	}

	/**
	 * 
	 * @param venueName
	 */

	 public String checkAvailability(int availableSeats) {
		if (availableSeats > 0) {
			return "Seats Available";
		} else {
			return "Sold Out";
		}
	}
	public String viewVenueDetails(String venueName) {
		return venueLocation+" , "+venueCapacity;
	}

}