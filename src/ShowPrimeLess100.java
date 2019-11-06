public class ShowPrimeLess100 {
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Prime less 100: ");
        for (int i = 1; i < 100; i++ ) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
