public class Items {
    private String name;
    private double price;
//adding constructor // getter //array list


    public Items( String name, double price){

        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    Items[] items = new Items[]
            {
                    new Items("Apple", 10.99),
                    new Items("Coconut", 7.49),
                    new Items("Orange", 5.99),
                    new Items("Watermelon", 15.75),
                    new Items("Peach", 3.25)
            };
}
