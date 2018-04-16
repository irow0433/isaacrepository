package movie.random;

public class TvShows {
	private String genre;
	private int Seasons;
	private String Name;
	private int Episodes;
	public TvShows(String Name, String genre, int Seasons, int Episodes)
	{
		this.genre = genre;
		this.Seasons = Seasons;
		this.Episodes = Episodes;
		this.Name = Name;
		
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setName(String name) {
		this.Name = Name;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getSeasons() {
		return this.Seasons;
	}
	
	public void setSeasons(int Seasons) {
		this.Seasons = Seasons;
	}
	
	public int getEpisodes() {
		return this.Episodes;
	}
	
	public void setEpisodes(int Episodes) {
		this.Episodes = Episodes;
	}

}
