package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data ={2,3,5,7,12,1,4,9,4,0,22,6,3,8,15};
        String[] data2 = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        for (String key : data2) {
            histogr.put(key, histogr.containsKey(key) ? histogr.get(key) + 1 : 1);
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
    
}
