package leetcodedaily;

import java.util.Arrays;
import java.util.HashMap;

public class BinaryTreeWithFactors {

    static HashMap<Integer, Integer> map = new HashMap<>();
    static int count = 0;
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5,10,20,40};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            printDivisors(arr[i]);
        }
        System.out.println(count);
        System.out.println(map);
        
    }

    static void printDivisors(int n) 
    { 
        if(!map.containsKey(n)) {
            map.put(n, 1);
            count = (count + 1) % 1000000007;
        }
        // Note that this loop runs till square root 
        for (int i=2; i<=Math.sqrt(n); i++) 
        { 
            
            if (n%i==0) 
            { 
                // If divisors are equal, print only one 
                if (n/i == i)  {
                    // System.out.print(" "+ i); 
                    if(map.containsKey(i)) {
                        count = (count + map.get(i)) % 1000000007;
                        map.put(n, map.get(i) + 1);
                    }
                }
       
                else  {// Otherwise print both 
                    // System.out.print(i+" " + n/i + " " ); 
                    if(map.containsKey(i) && map.containsKey(n/i)) {
                        int first = map.get(i) % 1000000007;
                        map.put(n, (map.get(n) + map.get(i)) % 1000000007);
                        int second = map.get(n / i) % 1000000007;
                        map.put(n, (map.get(n) + map.get(n / i)) % 1000000007);
                        count = (count + (first + second) % 1000000007) % 1000000007;
                        if(first != 1) {
                            int temp = first - 1;
                            map.put(n, map.get(n) + temp);
                            count = (count + temp) % 1000000007;
                        }

                        if(second != 1) {
                            int temp = second - 1;
                            map.put(n, map.get(n) + temp);
                            count = (count + temp) % 1000000007;
                        }
                        
                    }
                }
            } 
        }
    }
}
