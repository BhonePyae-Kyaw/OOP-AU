package worksheet9;
import java.util.ArrayList;
import java.util.Collections;

public class SortRectangleObject extends Rectangle{

	public static void main(String[] args) {
		ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
		rectangleList.add(new Rectangle(3,5,"rec1"));
		rectangleList.add(new Rectangle(2,2,"rec2"));
		rectangleList.add(new Rectangle(4,4,"rec3"));
		rectangleList.add(new Rectangle(2,6,"rec4"));
		rectangleList.add(new Rectangle(1,1,"rec5"));
		rectangleList.add(new Rectangle(1.5,1.5,"rec6"));
		
		Collections.sort(rectangleList);
		for (Rectangle o:rectangleList) {
			System.out.println(o.getRecName() + " (" + o.getWidth() + " x " + o.getHeight()+ " ) " + o.getArea());
		}
	}
}

//output of the code
//rec5 (1.0 x 1.0 ) 1.0
//rec6 (1.5 x 1.5 ) 2.25
//rec2 (2.0 x 2.0 ) 4.0
//rec4 (2.0 x 6.0 ) 12.0
//rec1 (3.0 x 5.0 ) 15.0
//rec3 (4.0 x 4.0 ) 16.0
