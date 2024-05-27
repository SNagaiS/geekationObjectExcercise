package objectExercise;

public abstract class Property {
	protected String landName;
	protected String owner;
	protected String type;
	protected int price;

	public void setLandName(String landName) {
		this.landName = landName;
	}

	public String getLandName() {
		return landName;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void Estate(
			String landName, String owner, String type, int price) {
		this.landName = landName;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}

	public abstract void RealEstate();

}
