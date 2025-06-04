public class Main2 {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Usage: java FactorialRecursion <integer>");
                return;
            }
            
            try {
                int number = Integer.parseInt(args[0]);
                if (number < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                    return;
                }
                
                System.out.println("Factorial of " + number + " is: " + factorial(number));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
        
        public static long factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
    }
