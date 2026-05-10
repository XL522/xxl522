package LambdaDemoe;

public class LambdaTest3 {
    public static void main(String[] args) {
        use(new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        use((a,b)->a-b);
    }
    public static void use(Calculator calculator){
        int result=calculator.calc(10,20);
        System.out.println(result);
    }
}

interface Calculator{
    int calc(int a,int b);
}
