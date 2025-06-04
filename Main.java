public class Main {
    public static void main(String args[]) {
        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
    }
}