import java.util.*;
public class LinearSearch {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int p = Linear(n, a, s);
        if (p != -1)
            System.out.print("Element found at:" + p);
        else
            System.out.print("Element not found");
    }

    public static int Linear(int k, int arr[], int t) {
        for (int i = 0; i < k; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }
}
