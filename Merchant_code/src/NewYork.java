public class NewYork extends City{
    private static NewYork instance = new NewYork();
    private NewYork(){}

    public static NewYork Instance(){
        return instance;
    }
}
