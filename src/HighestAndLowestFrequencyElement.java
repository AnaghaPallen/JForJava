import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyElement {
    public static void main(String[] args){
        int[] arr = {1,5,1,15,1,5};
        int highFreqValue = 0;
        int lowFreqValue = Integer.MAX_VALUE;
        int highFreqElement = 0;
        int lowFreqElement = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else map.put(arr[i], 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() < lowFreqValue){
                lowFreqValue = entry.getValue();
                lowFreqElement = entry.getKey();

            }
            if(entry.getValue() > highFreqValue){
                highFreqValue = entry.getValue();
                highFreqElement = entry.getKey();
            }
        }

        System.out.println("Low freq element is: " + lowFreqElement +
                " and high freq element is: " + highFreqElement );

    }
}
