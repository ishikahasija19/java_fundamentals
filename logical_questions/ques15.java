 public class ques15{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");
        for (int n = 2; n <= 50; n++) {
            boolean prime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(n + " ");
            }
        }
    }
}
