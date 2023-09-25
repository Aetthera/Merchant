import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {

    State current ;

    public State getState() {

        return this.current;
    }

    public void setState(State state) {
        this.current = state;
    }
    public City(){

        this.current= Montreal.Instance();

    }

    public void switch_City(){

        this.current.switch_City(this);
    }










//    private String name;
//    private String[] item_Names;
//    private Double[] item_Prices;
//
//    public String GetName()
//    {
//        return name;
//    }
//
//    // COMEBACK LATER
//    public void SetItemPrice(String item_Name, Double price)
//    {
//        for (int i = 0; i < item_Name.Length; i++)
//        {
//            if (item_Names[i] == item_Name)
//            {
//                item_Prices[i] = price;
//                return;
//            }
//        }
//
//        // Handle the case where the item doesn't exist in the city
//        throw new InvalidOperationException($"Item '{item_Name}' not available in {name}");
//    }
//
//    // COMEBACK LATER
//    public Double GetPurchasePrice(String item_Name)
//    {
//        for (int i = 0; i < item_Names.Length; i++)
//        {
//            if (item_Names[i] == item_Name)
//            {
//                return item_Prices[i];
//            }
//        }
//
//        // Handle the case where the item doesn't exist in the city
//        throw new InvalidOperationException($"Item '{itemName}' not available in {name}");
//    }


//=================================================================   OLD

//    public City(String name){
//        ArrayList<String> Fruits = new ArrayList<String>();
//        Fruits.add("Apple");
//        Fruits.add("Coconut");
//        Fruits.add("Orange");
//        Fruits.add("Berry");
//        Fruits.add("Peach");
//        System.out.println(Fruits);
//
//
//        ArrayList<Double> Price = new ArrayList<Double>();
//        Price.add(1.5);
//        Price.add(4.0);
//        Price.add(2.25);
//        Price.add(6.75);
//        Price.add(5.0);
//        System.out.println(Price);
//
//        ArrayList<Integer> Quantity = new ArrayList<Integer>();
//        Quantity.add(3);
//        Quantity.add(2);
//        Quantity.add(1);
//        Quantity.add(4);
//        Quantity.add(4);
//        System.out.println(Quantity);
//
//        //this one we have to have an object name game to put them all together
//        ArrayList<String> City = new ArrayList<>();
//        City.add("Montreal");
//        City.add("London");
//        City.add("Tokyo");
//        City.add("NewYork");
//    }
}
