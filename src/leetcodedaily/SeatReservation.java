package leetcodedaily;

import java.util.PriorityQueue;

public class SeatReservation {
    
}

class SeatManager {
    int n;
    int counter = 0;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public SeatManager(int n) {
        this.n = n;
    }
    
    public int reserve() {
        
        if(pq.isEmpty()) {
            counter++;
            return counter;
        }
        if(pq.peek() < counter++) {
            return pq.poll();
        }
        counter++;
        return counter;
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

