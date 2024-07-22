package odev1;

public class Campaign {
	private String campainName;
	private double discount;	
	
	public Campaign(String campainName, double discount) {
		this.campainName = campainName;
		this.discount = discount;
	}
	public String getCampainName() {
		return campainName;
	}
	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
