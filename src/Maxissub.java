import java.util.Comparator;
import java.util.PriorityQueue;

public class Maxissub {
    public static void main(String[] args) {
        int[] items = new int[] {1,4,3,7};
        int k = 3;
        maximumScore(items, k);
    }

    static int maximumScore(int[] nums, int k) {
        //Arrange the items in increasing order of their value
        Comparator<Item> itemComparator = new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                return Integer.compare(item1.val, item2.val);
            }
        };
        // min heap
        PriorityQueue<Item> minitem = new PriorityQueue<Item>(itemComparator);
        int min = Integer.MIN_VALUE;
        for(int i = 0; i <= k ; i++) {
            Item temp = new Item(nums[i], i);
            minitem.add(temp);
        }
        
        for(int i = 0; i <= k ; i++) {
            Item curr = minitem.peek();
            if(curr.index >= i) {
                int temp = curr.val * (k - i + 1);
                if(temp > min) {
                    min = temp;
                }
            }
            if(curr.index == i) {
                minitem.poll();
            }
            curr = minitem.peek();
            if(curr != null && curr.index < i) {
                minitem.poll();
            }
        }
        //print the items val and index in the heap

        
        return 0;
    }


}

class Item  {
    int val;
    int index;

    Item(int val, int index) {
        this.val = val;
        this.index = index;
    }
}
