package interfaceExample;
import java.util.Arrays;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(),new Orange()};
        for (Object obj: objects) {
            if (obj instanceof Edible)
                System.out.println(((Edible)obj).howToEat());

            if (obj instanceof Animal) {
                System.out.println(((Animal)obj).sound());
            }
            
            
            /*
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] instanceof Edible)
                    System.out.println(((Edible)objects[i]).howToEat());

                if (objects[i] instanceof Animal) {
                    System.out.println(((Animal)objects[i]).sound());
            }
             */
        }
        Chicken [] chickenList = new Chicken[10];
        for (int i =0; i < 10; i++) {
        	chickenList[i] = new Chicken();
        	chickenList[i].setWeight(Math.random()*10);;
        	System.out.println("Chicken's weight is" + chickenList[i].getWeight());
        }
        
        System.out.println("Sorted");
        Arrays.sort(chickenList);
        for (int i =0; i < 10; i++) {
        	System.out.println("Chicken's weight is" + chickenList[i].getWeight());
        }
    }
}

//generic

