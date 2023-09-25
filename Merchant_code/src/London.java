public class London extends State{
    private static London instance = new London();
    private London(){}

    @Override
    public void switch_City(City city) {

        city.setState(Tokyo.Instance());
        System.out.println("You're in Tokyo now");

    }

    public static London Instance(){
        return instance;
    }
}
