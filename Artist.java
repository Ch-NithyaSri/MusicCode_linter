public class Artist {

	private String artistName;
	private String musicStyle;

	public Artist() {
		this.artistName = "";
		this.musicStyle = "";
	}
	
	public Artist(String artistName, String musicStyle) {
		this.artistName = artistName;
		this.musicStyle = musicStyle;
	}
	

	public String getArtistName() {
		return this.artistName;
	}

	/**
	 * 
	 * @param artistName
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getMusicStyle() {
		return this.musicStyle;
	}

	/**
	 * 
	 * @param musicStyle
	 */
	public void setMusicStyle(String musicStyle) {
		this.musicStyle = musicStyle;
	}

	/**
	 * 
	 * @param artistName
	 */
	public void viewArtistDetails(String artistName) {
		System.out.println("Viewing details for artist: " + artistName);
		System.out.println("Music Style: " + this.musicStyle);  
	}
}