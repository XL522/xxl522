package LambdaDemoe;

public class LambdaTest1 {
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("reShow");
            }
        });
        useShowHandler(()->System.out.println("reShow"));
    }
    public static void useShowHandler (ShowHandler stirngHandler){
        stirngHandler.show();
    }
}
interface ShowHandler{
    void show();
}