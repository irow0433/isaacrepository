package movie.random;

public class Games {
	
	public Games() {
		allGames[0] = new Game("Fallout 4", "M", 28, "Fallout_4.png");
		allGames[1] = new Game("Fortnite: Battle Royal", "T", 14, "/fortnite.png");
		allGames[2] = new Game("PlayerUnknown BattleGrounds", "M", 30, "/pubg.png");
		allGames[3] = new Game("Overwatch", "T", 6, "/Overwatch.png");
		allGames[4] = new Game("Ark: Survival Evolved", "T", 75, "/Ark_Survival_Evolved.png");
		allGames[5] = new Game("Sea of Thieves", "T", 7, "/Sea_of_Thieves.png");
		allGames[6] = new Game("Kingdom come: Deliverance", "M", 23, "/Kingdom.png");
		allGames[7] = new Game("Cuphead", "T", 20, "/Cuphead.png");
		allGames[8] = new Game("State of Decay", "M", 2, "/State of Decay.png");
		allGames[9] = new Game("Minecraft", "E", 23, "/Minecraft.png");
		allGames[10] = new Game("Grand Theft Auto V", "M", 65, "/GTA5.png");
		allGames[11] = new Game("Battlefield 1", "M", 30, "/bf1.png");
		allGames[12] = new Game("Call of Duty: Black Ops 3", "M", 45, "/BO3.png");
		
		
	}
	
	public Game[] allGames = new Game[13];

}
