package movie.random;

public class Game {
	private String Game;
	private String Rating;
	private int Size;
	private String Image;
	//private String Description;
	
	public Game(String Game, String Rating, int Size, String Image) {
		this.Game = Game;
		this.Rating = Rating;
		this.Size = Size;
		this.Image = Image;
		//this.Description = Description;
	}
	
	public String getGame() {
		return this.Game;
	}
	
	public void setGame(String Zone) {
		this.Game = Game;
	}
	
	public String getRating() {
		return this.Rating;
	}
	
	public void setRating(String Rating) {
		this.Rating = Rating;
	}
	
	public int getSize() {
		return this.Size;
	}
	
	public void setSize(int Size) {
		this.Size = Size;
	}
	
	public String getImage() {
		return Image;
	}
	
	public void setImage(String Image) {
		this.Image = Image;
	}
//	
//	public String getDescription() {
//		return Description;
//	}
//	
//	public void setDescription(String Description) {
//		this.Description = Description;
//	}
	
	
	
	

}
