package week10;

public abstract class Ball implements Tossable{
	private String brandName;
	
	public Ball(String brandName) {
		this.brandName = brandName;
		System.out.println("This is " + getBrandName() + " brand.");
	}

	public String getBrandName() {
		return brandName;
	}
	
	public abstract void bounce();
	
}
