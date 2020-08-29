public class ForLoop {
    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest = " + calculateInterest(10000, 2));
        System.out.println("10.000 at 3% interest = " + calculateInterest(10000, 3));
        System.out.println("10.000 at 4% interest = " + calculateInterest(10000, 4));
        System.out.println("10.000 at 5% interest = " + calculateInterest(10000, 5));
        System.out.println("10.000 at 10% interest = " + calculateInterest(10000, 10));
        System.out.println("------------------------------");
        for(int i=5; i<15; i++){
            System.out.println("10.000 at " + i +"% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        System.out.println("------------------------------");
        for(int i=22; i>15; i--){
            System.out.println("10.000 at " + i +"% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
