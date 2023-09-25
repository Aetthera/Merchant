public class Montreal extends City{

    private static Montreal instance = new Montreal();
    private Montreal(){}

    public static Montreal Instance(){
        return instance;
    }
}
