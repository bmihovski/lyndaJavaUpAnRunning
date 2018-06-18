package realestatelistings;

public class Property {
	private double askingPrice;
	private String propertyType;
	private double lotSize;
	private int numBats;
	private int numBeds;

	public Property(double askingPrice, String propertyType, double lotSize) {
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize= lotSize;
		numBats = 0;
		numBeds = 0;
	}

	public Property(double askingPrice, String propertyType, double lotSize, int numBats, int numBeds) {
		this.askingPrice = askingPrice;
		this.propertyType = propertyType;
		this.lotSize = lotSize;
		this.numBats = numBats;
		this.numBeds = numBeds;
	}

	public String toString() {
		return "Asking price: $" + askingPrice +
				"\nProperty Type: " + propertyType +
				"\nLot Size: " + lotSize +
				"\nNumber of baths: " + numBats +
				"\nNumber of beds: " + numBeds;
	}

	public void setAskingPrice(double newPrice) {
		askingPrice = newPrice;

	}


}
