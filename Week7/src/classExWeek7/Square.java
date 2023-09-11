package classExWeek7;

public class Square extends GeometricObject{
	private double width;
	Square () {
	}
	
	public Square (double width, String color, boolean filled) {
		this.width = width;
		setColor(color);
		setFilled(filled);
		
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return width * width;
	}
	
	public double getPerimeter() {
		return 4 * width;
	}
	
	public String printSquare() {
		return "This is a square object.\nIt is "+ super.toString();
	}
}
 