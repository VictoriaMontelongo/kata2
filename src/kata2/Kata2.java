package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data ={2,3,5,7,12,1,4,9,4,0,22,6,3,8,15};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (int key : data) {
            histogr.put(key, histogr.containsKey(key) ? histogr.get(key) + 1 : 1);
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
