package LambdaDemoe;

public class LambdaTest2 {
    public static void main(String[] args) {
            useStringHandler(msq -> System.out.println(msq));

    }
    public static void useStringHandler(StirngHandler stirngHandler){
        stirngHandler.printMessage("itheima");
    }
}


interface StirngHandler {
    void printMessage(String msq);
}