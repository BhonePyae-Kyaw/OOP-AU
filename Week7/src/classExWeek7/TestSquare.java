package classExWeek7;

public class TestSquare {

	public static void main(String[] args) {
		Square s1 = new Square(2.5, "blue", true); //testing constructor with parameters.
		System.out.println(
				s1.printSquare() + 
				"\nIts area is " + s1.getArea() + " square centimeters." +
				"\nIts perimeter is " + s1.getPerimeter()+ " centimeter." +
				"\nIts width is " + s1.getWidth() + " centimeter."
			);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		Square s2 = new Square(); //testing constructor with no parameter.
		s2.setWidth(2); //for testing setWidth()
		System.out.println(
				s2.printSquare() + 
				"\nIts area is " + s2.getArea() + " square centimeters." +
				"\nIts perimeter is " + s2.getPerimeter()+ " centimeter." +
				"\nIts width is " + s2.getWidth() + " centimeter."
			);
	}
}
//Output of the code.
//This is a square object.
//It is created on Thu Jul 27 15:03:08 ICT 2023
//color: blue
//filled: true
//Its area is 6.25 square centimeters.
//Its perimeter is 10.0 centimeter.
//Its width is 2.5 centimeter.
//++++++++++++++++++++++++++++++++++++++++++
//This is a square object.
//It is created on Thu Jul 27 15:03:08 ICT 2023
//color: white
//filled: false
//Its area is 4.0 square centimeters.
//Its perimeter is 8.0 centimeter.
//Its width is 2.0 centimeter.
