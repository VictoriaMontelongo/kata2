package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Kata2 {

    public static void main(String[] args) {
        int[] data ={2,3,5,7,12,1,4,9,4,0,22,6,3,8,15};
        
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
            System.out.println(key + "==>" + histogram.get(key));
        }
        
    }
    
}
