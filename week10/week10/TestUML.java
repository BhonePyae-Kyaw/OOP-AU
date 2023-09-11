package week10;

public class TestUML {

	public static void main(String[] args) {
		
		//Testing baseball
		System.out.println("Testing Baseball: ");
		Baseball baseball = new Baseball("Wilson");
		baseball.toss();
		baseball.bounce();
		System.out.println();
		
		
		
		//Testing football
		System.out.println("Testing football: ");
		Football football = new Football("Nike");
		football.toss();
		football.bounce();
		System.out.println();
		
		//Testing rock
		System.out.println("Testing rock: ");
		Rock rock = new Rock();
		rock.toss();
		System.out.println();
		
		System.out.println("Testing interface as a type: ");
		Tossable obj1 = new Football("Kappa");
		obj1.toss();
		System.out.println();
		
		if (baseball instanceof Baseball) {
			baseball.bounce();
		}
	}
}

//Output of the testing
//Testing Baseball: 
//This is Wilson brand.
//To toss baseball: Throw up the baseball in the air.
//To bounce the baseball: Throw the baseball to the ground.
//
//Testing football: 
//This is Nike brand.
//To toss a football: maintain in the air.
//To bounce a football: Kick it.
//
//Testing rock: 
//Toss the rock.