public class IsPrime {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 3; i < 100; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " é um número primo!");
                if(count == 10){
                    System.out.println("Encontrei 10 números");
                    break;
                }
            };

        }
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
