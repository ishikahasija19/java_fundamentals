import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = (n%3==0 && n%5==0) ? "Divisible by both" : "Not divisible by both";
        System.out.println(result);
    }
}
