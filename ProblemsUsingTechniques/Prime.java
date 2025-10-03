package ProblemsUsingTechniques;
// square root technique used here (factors)
public class Prime {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); ++i) {   // square root technique used here
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        primeInRange(100);
    }
}
