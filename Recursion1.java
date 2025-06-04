public class Recursion1 {
    public static void printSum(int i, int n, int sum) {
        if (i > n) { // Base case: when i exceeds n
            System.out.println("Sum is: " + sum);
            return;
        }
        sum += i; // Add current i to sum
        printSum(i + 1, n, sum); // Increment i for the next call
    }
    public static void Factorial( int n, int res) {
        if (n==1) { // Base case: when i exceeds n
            System.out.println("Factorial is: " + res);
            return;
        }
        res = res*n; // Add current i to sum
        Factorial(n-1,res); // Increment i for the next call
    }

    public static void Fibonacci(int a , int b , int n) {
        if(n==0) return;
        int c = a + b ;
        System.out.println(c);
        Fibonacci(b , c , n-1);
    }

    public static int CalcPower(int x, int n ) {
        if(n == 0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        int Calcnm1 = CalcPower( x , n-1);
        int res = x* Calcnm1;
        return res;
    }

    public static void main(String[] args) {
        // int n = 8;
        // int a = 0; int b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // Fibonacci(a, b, n-2);

        int x = 2;
        int n = 5;
        System.out.println(CalcPower(x, n));
    }
}