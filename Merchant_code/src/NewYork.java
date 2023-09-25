public class NewYork extends State{
    private static NewYork instance = new NewYork();
    private NewYork(){}

    @Override
    public void switch_City(City city) {

        city.setState(Montreal.Instance());
        System.out.println("You're in Montreal now");
    }

    public static NewYork Instance(){
        return instance;
    }
}
