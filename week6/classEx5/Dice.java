package classEx5;

public class Dice {
	private int faceUp;
	
	public Dice(int faceUp) {
		this.faceUp = faceUp;
	}
	
	public int getPip() {
		return faceUp;
	}
	
	public int rollDice() {
		return (((int) (Math.random()*100))% 6) +1; 
	}
}
