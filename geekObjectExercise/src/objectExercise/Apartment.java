package objectExercise;

public class Apartment extends Property {
	private String size;

	Apartment(String landName, String owner, String type, int price, String size) {
		super(landName, owner, type, price);
		this.size = size;
	}

	@Override
	public void RealEstate() {
		System.out.println("=============================");
		System.out.println("物件名：" + landName);
		System.out.println("物件所有者名：" + owner);
		System.out.println("物件種別：" + type);
		System.out.println("物件価格：" + price + "円");
		System.out.println("間取り：" + size);
		System.out.println("=============================");
	}
}