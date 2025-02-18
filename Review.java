public class Review {

	private String reviewID;
	private int rating;
	private String review;

	public Review() {
		// Default constructor
		this.review = "";
		this.rating = 0;
	}
	
	public Review(String review, int rating) {
		this.review = review;
		this.rating = rating;
	}

	public void writeReview(String newReview) {
		this.review = newReview;
		System.out.println("Review added: " + review);
	}

	public void rateReview(int rating) {
		System.out.println("Review rated: " + rating + " stars");
	}
	

	public String getReviewID() {
		return this.reviewID;
	}

	/**
	 * 
	 * @param reviewID
	 */
	public void setReviewID(String reviewID) {
		this.reviewID = reviewID;
	}

	public int getRating() {
		return this.rating;
	}

	/**
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}
	
	/**
	 * 
	 * @param review
	 */
	public void setReview(String review) {
			this.review = review;
		
	}
}

