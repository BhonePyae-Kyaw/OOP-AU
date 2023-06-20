package classEx1;
import java.util.Scanner;
public class FindHollowCylinderVolume {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter the outer radius: ");
		float oRadius = myInput.nextFloat();
		System.out.print("Enter the inner radius: ");
		float iRadius = myInput.nextFloat();
		System.out.print("Enter the height: ");
		float height = myInput.nextFloat();
		double volume = Math.PI * ((oRadius * oRadius) - (iRadius * iRadius)) * height;
		System.out.println("The volume of this hollow cylinder is "+String.format("%.2f",volume));
		myInput.close();
	}

}
