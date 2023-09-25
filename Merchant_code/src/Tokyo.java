public class Tokyo  extends City{
    private static Tokyo instance = new Tokyo();
    private Tokyo(){}


    public static Tokyo Instance(){
        return instance;
    }
}
