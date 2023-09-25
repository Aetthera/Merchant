public class Montreal extends State{

    private static Montreal instance = new Montreal();
    private Montreal(){}

    public static Montreal Instance(){
        return instance;
    }
}
