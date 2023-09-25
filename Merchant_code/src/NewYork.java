public class NewYork extends State{
    private static NewYork instance = new NewYork();
    private NewYork(){}

    public static NewYork Instance(){
        return instance;
    }
}
