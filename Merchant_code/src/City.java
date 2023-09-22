import java.util.ArrayList;

public class City {
    private String name;

    public City(String name){
        ArrayList<String> Fruits = new ArrayList<String>();
        Fruits.add("Apple");
        Fruits.add("Coconut");
        Fruits.add("Orange");
        Fruits.add("Berry");
        Fruits.add("Peach");
        System.out.println(Fruits);


        ArrayList<Double> Price = new ArrayList<Double>();
        Price.add(1.5);
        Price.add(4.0);
        Price.add(2.25);
        Price.add(6.75);
        Price.add(5.0);
        System.out.println(Price);

        ArrayList<Integer> Quantity = new ArrayList<Integer>();
        Quantity.add(3);
        Quantity.add(2);
        Quantity.add(1);
        Quantity.add(4);
        Quantity.add(4);
        System.out.println(Quantity);

        //this one we have to have an object name game to put them all together
        ArrayList<String> City = new ArrayList<>();
        City.add("Montreal");
        City.add("London");
        City.add("Tokyo");
        City.add("NewYork");



    }
}
