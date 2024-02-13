import java.util.*;

public class BinarySearch {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int k = sc.nextInt();
        int z = Binary(n, a, k);
        if (z == -1)
            System.out.print("not found");
        else
            System.out.print("Found at index:" + z);
    }

    public static int Binary(int p, int arr[], int s) {
        int l = 0, r = arr.length - 1;
        int mid = (l + (r - l)) / 2;
        while (l < r)
            if (arr[mid] == s)
                return mid;
        if (arr[mid] < s)
            l = mid + 1;
        else
            r = mid - 1;
        return -1;
    }
}