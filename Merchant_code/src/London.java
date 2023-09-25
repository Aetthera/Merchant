public class London extends City{
    private static London instance = new London();
    private London(){}


    public static London Instance(){
        return instance;
    }
}
