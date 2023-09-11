package abstractClassExample;

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject geoObj1 = new Circle(); 
		GeometricObject geoObj2 = new Rectangle(3,4);
		System.out.println(geoObj1);
		System.out.println(geoObj2);
		System.out.println(geoObj2.getArea());
		System.out.println(geoObj1.getArea());

	}

}
