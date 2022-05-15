import java.util.*;

public class hello {
    public static int missingNumber(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n)
                arr[i] = n + 1;
        }
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (index >= n)
                continue;
            else if (arr[index] > 0) {
                arr[index] = -1 * arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                return i + 1;
        }
        return n + 1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        int ans = missingNumber(arr, n);
        System.out.println("answer" + ans);
    }
}
