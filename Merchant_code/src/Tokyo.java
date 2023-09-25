public class Tokyo  extends State{
    private static Tokyo instance = new Tokyo();
    private Tokyo(){}

    @Override
    public void switch_City(City city) {

        city.setState(Tokyo.Instance());
        System.out.println("You're in NewYork now");
    }

    public static Tokyo Instance(){
        return instance;
    }
}
