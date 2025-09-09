import java.util.*;

 public class ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char c : str.toCharArray()) {
            if (c == ' ') break;   // stop when space found
            System.out.print(c);
        }

        sc.close();
    }
}
