public class fibonacciSsequence{
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}