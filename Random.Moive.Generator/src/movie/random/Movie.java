package movie.random;

public class Movie {
	private String title;
	private String categorie;
	private int runningTime;
	private String rating;
	private String image;
	private String Description;
	
	//Constructors
	public Movie() {
		
	}
	
	public Movie(String title, String categorie, int runningTime, String rating, String image, String Description) {
		this.title = title;
		this.categorie = categorie;
		this.runningTime = runningTime;
		this.rating = rating;
		this.image = image;
		this.Description = Description;
	}
	
	//Getters/Setters
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategorie() {
		return this.categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getRunningTime() {
		return this.runningTime;
	}
	
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getDescription() {
		return this.Description;
	}
	
	public void setDescription(String Description) {
		this.Description = Description;
	}
}


