package worksheet9;

public class Rectangle implements Comparable <Rectangle>{
	private double width;
	private double height;
	private String recName;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height, String recName) {
		this.width = width;
		this.height = height;
		this.recName = recName;
		getArea();
	}
	
	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	
	public double getWidth() {
		return width;
	}
	
	
	public double getHeight() {
		return height;
	}
	
	
	public double getArea() {
		return width * height;
	}
	
	@Override
	public int compareTo(Rectangle o) {
		if (getArea() == o.getArea()) {
			return 0;
		}
		else if (getArea()>o.getArea()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}