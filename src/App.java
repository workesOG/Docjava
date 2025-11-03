import basic_programming.iteration.Fibonacci;

public class App {
    public static void main(String[] args) throws Exception {
        Fibonacci fib = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(fib.fibonacci(i));
        }
    }
}
