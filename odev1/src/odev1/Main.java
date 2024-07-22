package odev1;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign("ramazan bayramı kamoanyası", 10);
		Game GTA = new Game(1, "Gta" ,1000,campaign );
		Gamer gamer = new Gamer(1, "kadir", "karaoğlu", "20");
		Gamer gamer2 = new Gamer(2, "ali", "karaoğlu", "23");
		Gamer gamer3 = new Gamer(3, "veli", "karaoğlu", "18");
		Gamer gamer4 = new Gamer(4, "yagmur", "karaoğlu", "19");
		
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		Game[] games= {GTA};
		
		GameManager  gameManager = new GameManager();
		gameManager.addGame(games);
		
		Gamer [] gamers = {gamer , gamer2, gamer3, gamer4};		
		GamerManager gamerManager =new GamerManager();
	gamerManager.addGamer(gamers); 
	
	gameManager.sellGame(games, campaign);

	}

}
