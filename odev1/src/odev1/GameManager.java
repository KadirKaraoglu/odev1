package odev1;

public class GameManager {
	public void addGame(Game[] games) {
		for(Game game : games) {
			System.out.println("oyun eklendi " + game.getGameName() );
		}
	}
	public void deleteGame(Game[] games) {
		for(Game game : games) {
			System.out.println("oyun sılındı " + game.getGameName() );
		}
	}
	public void sellGame(Game[] games,Campaign campaign) {
		for(Game game : games) {
			System.out.println(game.getGameName()+"oyunu "+ campaign.getDiscount()+" oranında ındırım ıle " + game.getAfterDiscountunitPrice()+"ye satıldı");
		}
	}

}
