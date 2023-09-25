public class State{
    public void switch_City(City city) {

        city.setState(London.Instance());
        System.out.println("You're in London now");

    }
}
