import java.util.*;

 public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);  // sort in ascending order
        System.out.println("Second largest = " + arr[8]); // index 8 = 2nd last

        sc.close();
    }
}
