public class Tokyo  extends State{
    private static Tokyo instance = new Tokyo();
    private Tokyo(){}


    public static Tokyo Instance(){
        return instance;
    }
}
