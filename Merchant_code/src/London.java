public class London extends State{
    private static London instance = new London();
    private London(){}


    public static London Instance(){
        return instance;
    }
}
