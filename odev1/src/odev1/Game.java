package odev1;

public class Game {
	
	private Campaign campaign; 
	
	private int id;
	private String gameName;
	private double gameUnitPrice;
	
	

	public Game(int id, String gameName, double gameUnitPrice,Campaign campaign) {
		this.id = id;
		this.gameName = gameName;
		this.gameUnitPrice = gameUnitPrice;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public double getGameUnitPrice() {
		return gameUnitPrice;
	}

	public void setGameUnitPrice(double gameUnitPrice) {
		this.gameUnitPrice = gameUnitPrice;
	}

	public double getAfterDiscountunitPrice() {
		return gameUnitPrice-(gameUnitPrice* campaign.getDiscount() );
	}

}
