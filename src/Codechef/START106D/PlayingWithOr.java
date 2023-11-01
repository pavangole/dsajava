package Codechef.START106D;


import java.util.Scanner;

public class PlayingWithOr {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static void solve() {

        int n = sc.nextInt();
        int k = sc.nextInt();       int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int count = 0;
        int start = 0;
        int end = k - 1;
        int odd = 0;
        for (int i = 0; i < k; i++) {
            if (arr[i] % 2 != 0)
                odd++;
        }
        if (odd != 0) {
            count++;
        }
        while (end < n  - 1 && end - start == k - 1) {
            if (arr[start] % 2 != 0)
                odd--;
            start++;
            end++;
            if (end < n) {
                if (arr[end] % 2 != 0)
                    odd++;
            }
            if (odd != 0) {
                count++;
            }
            
        }
        System.out.println(count);
    }

}
