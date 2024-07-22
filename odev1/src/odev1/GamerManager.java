package odev1;

public class GamerManager {
	public void addGamer(Gamer[] gamers) {
		for(Gamer gamer : gamers) {
			System.out.println("oyuncu eklendi " + gamer.firstName); 

		}
		
	}
	public void deleteGamer(Gamer[] gamers) {
		for(Gamer gamer : gamers) {
			System.out.println("oyuncu sılındı " + gamer.firstName); 

		}
		
	}
	public void guncellemeGamer(Gamer[] gamers) {
		for(Gamer gamer : gamers) {
			System.out.println("oyuncu güncellendi " + gamer.firstName); 

		}
		
	}

}
