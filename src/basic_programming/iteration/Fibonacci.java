package basic_programming.iteration;

// Opgave 9
public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/* Testkode for opgave 9
Fibonacci fib = new Fibonacci();
for (int i = 0; i < 10; i++) {
    System.out.println(fib.fibonacci(i));
}

OUTPUT:
0
1
1
2
3
5
8
13
21
34
*/