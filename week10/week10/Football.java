package week10;

public class Football extends Ball {

	public Football(String brandName) {
		super(brandName);
	}
	
	public void toss() {
		System.out.println("To toss a football: maintain in the air.");
	}
	
	public void bounce() {
		System.out.println("To bounce a football: Kick it.");
	}
}
