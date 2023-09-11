package week10;

public class Baseball extends Ball {

	public Baseball(String brandName) {
		super(brandName);
	}
	
	public void toss() {
		System.out.println("To toss baseball: Throw up the baseball in the air.");
	}
	
	public void bounce() {
		System.out.println("To bounce the baseball: Throw the baseball to the ground.");
	}
}
